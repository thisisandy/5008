//
// Created by Andy Hu on 8/8/23.
//
#include <stdio.h>

int max(int a, int b) {
    return (a > b) ? a : b;
}

int knapsack(int W, int wt[], int val[], int n) {
    int dp[W+1];
    for(int w = 0; w <= W; w++) {
        dp[w] = 0;
    }

    for(int i = 0; i < n; i++) {
        for(int w = W; w >= wt[i]; w--) {
            dp[w] = max(dp[w], val[i] + dp[w - wt[i]]);
        }
    }

    return dp[W];
}

int main() {
    int n;
    printf("Number of items:\n");
    scanf("%d", &n);

    int val[n], wt[n];
    printf("Item values:\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &val[i]);
    }

    printf("Item weights:\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &wt[i]);
    }

    int W;
    printf("Knapsack weight capacity:\n");
    scanf("%d", &W);

    printf("Answer: Maximum value: %d\n", knapsack(W, wt, val, n));
    return 0;
}
