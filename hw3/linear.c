//
// Created by Andy Hu on 6/26/23.
//
#include <stdio.h>

// Function to convert a decimal number to binary
int decimalToBinary(int n) {
    int binary = 0;
    int pow = 1;

    while (n > 0) {
        binary += (n % 2) * pow;
        n /= 2;
        pow *= 10;
    }

    return binary;
}

// Function to convert a binary number to decimal
int binaryToDecimal(int n) {
    int decimal = 0;
    int base = 1;

    while (n) {
        int last_digit = n % 10;
        n = n / 10;
        decimal += last_digit * base;
        base = base * 2;
    }

    return decimal;
}


// Function to perform linear search
int linearSearch(int arr[], int n, int target) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
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

    // Convert array and target to binary
    printf("Converted array:\n");
    for (int i = 0; i < n; i++) {
        arr[i] = decimalToBinary(arr[i]);
        printf("%d ", arr[i]);
    }
    target = decimalToBinary(target);
    printf("\nConverted target:\n%d\n", target);

    // Perform linear search
    int result = linearSearch(arr, n, target);
    printf("Search result:\n%d\n", result);

    // Convert back to original form
    printf("Original array:\n");
    for (int i = 0; i < n; i++) {
        arr[i] = binaryToDecimal(arr[i]);
        printf("%d ", arr[i]);
    }
    target = binaryToDecimal(target);
    printf("\nOriginal target:\n%d\n", target);

    return 0;
}
