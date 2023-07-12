//
// Created by Andy Hu on 7/12/23.
//
#include <stdio.h>
#include <stdlib.h>

#define MAX 4

// Structure for Adjacency List Node
typedef struct node
{
    int vertex;
    struct node* next;
} node;

// Function to create a new node
node* createNode(int v)
{
    node* newNode = malloc(sizeof(node));
    if(newNode == NULL)
    {
        printf("\nError in node creation");
        exit(0);
    }
    newNode->vertex = v;
    newNode->next = NULL;
    return newNode;
}

// Function to print Adjacency List
void printAdjacencyList(node* adjList[])
{
    printf("\nAdjacency List:\n");
    for(int v = 0; v < MAX; v++)
    {
        node* temp = adjList[v];
        printf("\n%d: ", v);
        while(temp)
        {
            printf("%d->", temp->vertex);
            temp = temp->next;
        }
        printf("NULL");
    }
}

// Function to print Adjacency Matrix
void printAdjacencyMatrix(int adjMatrix[MAX][MAX])
{
    printf("\nAdjacency Matrix:\n");
    for(int i = 0; i < MAX; i++)
    {
        for(int j = 0; j < MAX; j++)
        {
            printf("%d ", adjMatrix[i][j]);
        }
        printf("\n");
    }
}

// Convert Adjacency Matrix to Adjacency List
void convertMatrixToList(int adjMatrix[MAX][MAX], node* adjList[MAX])
{
    for(int i = 0; i < MAX; i++)
    {
        node* last = NULL;
        for(int j = 0; j < MAX; j++)
        {
            if(adjMatrix[i][j] == 1)
            {
                if(adjList[i] == NULL)
                {
                    adjList[i] = last = createNode(j);
                }
                else
                {
                    last = last->next = createNode(j);
                }
            }
        }
    }
}

int main()
{
    int adjMatrix[MAX][MAX] = {
            {0, 1, 1, 0},
            {0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 0, 1, 0}
    };
    node* adjList[MAX] = {NULL};

    printAdjacencyMatrix(adjMatrix);
    convertMatrixToList(adjMatrix, adjList);
    printAdjacencyList(adjList);

    return 0;
}
