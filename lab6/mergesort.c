//
// Created by Andy Hu on 6/21/23.
//


#include <stdio.h>
#include <stdlib.h>
int* mergeSort(int * arr, int start, int end){
    if (end <= start){
        return arr;
    }
    int middle = (start + end) >> 1;
//    end included
    mergeSort(arr, start, middle);
    mergeSort(arr, middle + 1, end);
    int * temp = (int *)malloc(sizeof(int) * (end - start + 1));
    int i  = start;
    int j = ((start+end)>>1) + 1;
    int k = 0;
    while(i<=middle || j <=end){
        if (i > middle){
            temp[k++] = arr[j++];
            continue;
        }
        if (j > end) {
            temp[k++] = arr[i++];
            continue;
        }
        if (arr[i] < arr[j]){
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }
    for (int i = start; i<=end; i++){
        arr[i] = temp[i-start];
    }
    free(temp);
    return arr;
}


int main(){
    printf("Input the length of the array now: ");
    int length;
    scanf("%d", &length);
    int * arr = (int *)malloc(sizeof(int) * length);
    for(int i = 0; i<length; i++){
        printf("Input the %dth element: ", i+1);
        scanf("%d", arr+i);
    }
    arr = mergeSort(arr, 0, length-1);
    for (int i = 0; i<length; i++){
        printf("%d ", arr[i]);
    }
}