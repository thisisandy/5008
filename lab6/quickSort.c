//
// Created by Andy Hu on 6/21/23.
//
#include <stdio.h>
#include <stdlib.h>
int * quickSort(int * arr, int start, int end){
    if (start >= end){
        return arr;
    }
    int pivot = arr[start];
    int cursor = start;
    for (int i = start+1; i<=end; i++){
        if (arr[i] < pivot){
            int temp = arr[i];
            arr[i] = arr[cursor];
            arr[cursor] = temp;
            cursor ++;
        }
    }
    quickSort(arr, start, cursor-1);
    quickSort(arr, cursor+1, end);
    return arr;
}

int main(){
    printf("Input the length of the array: ");
    int length;
    scanf("%d", &length);
    int * arr = (int *)malloc(sizeof(int) * length);
    for (int i = 0; i<length; i++){
        printf("Input the %dth element: ", i+1);
        scanf("%d", arr+i);
    }
    arr = quickSort(arr, 0, length-1);
    for (int i = 0; i<length; i++){
        printf("%d ", arr[i]);
    }
}