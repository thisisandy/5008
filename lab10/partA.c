//
// Created by Andy Hu on 7/26/23.
//
#include <stdio.h>
#include <stdlib.h>

// Structure to represent a node in the chain
struct Node {
    int data;
    struct Node* next;
};

// Structure to represent the hash table
struct HashTable {
    int size;
    struct Node** chains;
};

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to create a new hash table
struct HashTable* createHashTable(int size) {
    struct HashTable* table = (struct HashTable*)malloc(sizeof(struct HashTable));
    table->size = size;
    table->chains = (struct Node**)malloc(sizeof(struct Node*) * size);
    for (int i = 0; i < size; i++)
        table->chains[i] = NULL;
    return table;
}

// Function to insert a value into the hash table
void insert(struct HashTable* table, int value) {
    int index = value % table->size;
    struct Node* newNode = createNode(value);
    if (table->chains[index] == NULL) {
        table->chains[index] = newNode;
    } else {
        struct Node* current = table->chains[index];
        while (current->next != NULL)
            current = current->next;
        current->next = newNode;
    }
}

// Function to print the content of the hash table
void printHashTable(struct HashTable* table) {
    for (int i = 0; i < table->size; i++) {
        printf("Chain[%d] -> ", i);
        struct Node* current = table->chains[i];
        while (current != NULL) {
            printf("%d -> ", current->data);
            current = current->next;
        }
        printf("NULL\n");
    }
}

// Function to free the memory allocated for the hash table
void freeHashTable(struct HashTable* table) {
    for (int i = 0; i < table->size; i++) {
        struct Node* current = table->chains[i];
        while (current != NULL) {
            struct Node* temp = current;
            current = current->next;
            free(temp);
        }
    }
    free(table->chains);
    free(table);
}

int main() {
    int chainSize, numValues, value;

    printf("Chain Size: ");
    scanf("%d", &chainSize);

    struct HashTable* table = createHashTable(chainSize);

    printf("Number of values: ");
    scanf("%d", &numValues);

    printf("Input Values:\n");
    for (int i = 0; i < numValues; i++) {
        scanf("%d", &value);
        insert(table, value);
    }

    printf("The table:\n");
    printHashTable(table);

    freeHashTable(table);

    return 0;
}
