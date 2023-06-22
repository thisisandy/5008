


int fib(int n){
    if (n == 0 || n == 1){
        return 1;
    }
    return fib(n-1) + fib(n-2);
}

int main(){
    printf("Input the number for factorial calculation: ");
    int n;
    scanf("%d", &n);
    printf("\nThe factorial of is %d.\n", fib(n));
}
