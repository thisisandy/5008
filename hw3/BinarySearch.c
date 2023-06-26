//
// Created by Andy Hu on 6/26/23.
//
#include <stdio.h>

// Function to perform binary search
int binarySearch(int arr[], int l, int r, int target) {
    if (r >= l) {
        int mid = l + (r - l) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return binarySearch(arr, l, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, r, target);
    }

    return -1;
}

// Function to sort the array
void sort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() {
    int n, target;

// Input array size and elements
    printf("Input array size:\n");
    scanf("%d", &n);
    int arr[n];

    printf("Input elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

// Input target
    printf("Input target:\n");
    scanf("%d", &target);

// Print array and target
    printf("The array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\nThe target:\n%d\n", target);

// Sort the array
    sort(arr, n);

// Perform binary search
    int result = binarySearch(arr, 0, n - 1, target);
    printf("Search result:\n%d\n", result);

    return 0;
}
