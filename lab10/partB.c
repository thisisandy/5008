#include <stdio.h>
#include <stdlib.h>

// Structure to represent the hash table
struct HashTable {
    int size;
    int *table;
};

// Function to create a new hash table
struct HashTable *createHashTable(int size) {
    struct HashTable *table = (struct HashTable *) malloc(sizeof(struct HashTable));
    table->size = size;
    table->table = (int *) malloc(sizeof(int) * size);
    for (int i = 0; i < size; i++)
        table->table[i] = -1; // Initialize all slots as empty (-1)
    return table;
}

// Hash function for linear and quadratic probing
int hashFunction(int key, int size) {
    return key % size;
}

// Function to insert a value using linear probing
void linearProbingInsert(struct HashTable *table, int value) {
    int index = hashFunction(value, table->size);
    int i = 0;
    while (table->table[index] != -1) {
        index = (index + 1) % table->size;
        i++;
    }
    table->table[index] = value;
}

// Function to insert a value using quadratic probing
void quadraticProbingInsert(struct HashTable *table, int value) {
    int index = hashFunction(value, table->size);
    int i = 0;
    while (table->table[index] != -1) {
        index = (index + i * i) % table->size;
        i++;
    }
    table->table[index] = value;
}

// Hash function for double hashing
int hashFunctionH1(int key, int size) {
    return key % size;
}

int hashFunctionH2(int key) {
    return 7 - (key % 7);
}

int doubleHashingFunction(int key, int size, int i) {
    int h1 = hashFunctionH1(key, size);
    int h2 = hashFunctionH2(key);
    return (h1 + i * h2) % size;
}

// Function to insert a value using double hashing
void doubleHashingInsert(struct HashTable *table, int value) {
    int index = hashFunctionH1(value, table->size);
    int i = 0;
    while (table->table[index] != -1) {
        index = doubleHashingFunction(value, table->size, i);
        i++;
    }
    table->table[index] = value;
}

// Function to print the content of the hash table
void printHashTable(struct HashTable *table) {
    for (int i = 0; i < table->size; i++) {
        printf("Table[%d] -> %d\n", i, table->table[i]);
    }
}

// Function to free the memory allocated for the hash table
void freeHashTable(struct HashTable *table) {
    free(table->table);
    free(table);
}
int main() {
    int tableSize, numValues, value;
    int probingType;

    printf("Table Size: ");
    scanf("%d", &tableSize);

    if (tableSize <= 0) {
        printf("Invalid table size.\n");
        return 1; // Return error code to indicate failure
    }

    printf("Choose probing type (1-Linear, 2-Quadratic, 3-Double Hashing): ");
    scanf("%d", &probingType);

    struct HashTable* table = createHashTable(tableSize);

    printf("Number of values: ");
    scanf("%d", &numValues);

    if (numValues > tableSize) {
        printf("Number of values cannot exceed the table size.\n");
        freeHashTable(table);
        return 1; // Return error code to indicate failure
    }

    printf("Input Values:\n");
    for (int i = 0; i < numValues; i++) {
        scanf("%d", &value);

        switch (probingType) {
            case 1:
                linearProbingInsert(table, value);
                break;
            case 2:
                quadraticProbingInsert(table, value);
                break;
            case 3:
                doubleHashingInsert(table, value);
                break;
            default:
                printf("Invalid probing type.\n");
                freeHashTable(table);
                return 1; // Return error code to indicate failure
        }
    }

    printf("The table:\n");
    printHashTable(table);

    freeHashTable(table);

    return 0;
}