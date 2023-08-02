//
// Created by Andy Hu on 8/2/23.
//

#include <stdio.h>
#include <limits.h>

// Function to find the minimum number of coins needed to make the amount
int minCoins(int coins[], int m, int amount) {
    int table[amount + 1];
    table[0] = 0;

    // Initialize all table values as Infinite
    for (int i = 1; i <= amount; i++)
        table[i] = INT_MAX;

    // Compute minimum coins required for all
    // values from 1 to amount
    for (int i = 1; i <= amount; i++) {
        // Go through all coins smaller than i
        for (int j = 0; j < m; j++)
            if (coins[j] <= i) {
                int sub_res = table[i - coins[j]];
                if (sub_res != INT_MAX && sub_res + 1 < table[i])
                    table[i] = sub_res + 1;
            }
    }

    if (table[amount] == INT_MAX)
        return -1;
    else
        return table[amount];
}

int main() {
    int m;
    printf("Enter the number of different coins: ");
    scanf("%d", &m);

    int coins[m];
    printf("Enter the coin values:\n");
    for (int i = 0; i < m; i++)
        scanf("%d", &coins[i]);

    int amount;
    printf("Enter the amount: ");
    scanf("%d", &amount);

    int min_count = minCoins(coins, m, amount);
    if (min_count == -1)
        printf("Impossible to make the amount with given coins\n");
    else
        printf("Minimum number of coins required: %d\n", min_count);

    return 0;
}
