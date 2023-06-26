#include <stdio.h>
#include <stdlib.h>

int factorial(int n){
    if (n == 1){
        return 1;
    }
    return n * factorial(n-1);
}

int main(){
    printf("Input the number for factorial calculation: ");
    int n;
    scanf("%d", &n);
    printf("\nThe factorial of is %d.\n", factorial(n));
}
