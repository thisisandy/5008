#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Define the Node structure
typedef struct Node {
    int data;
    struct Node* left;
    struct Node* right;
} Node;

// Function to create a new node
Node* createNode(int data) {
    Node* newNode = (Node*) malloc(sizeof(Node));
    if(newNode == NULL) {
        printf("Error creating a new node.\n");
        exit(0);
    }
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;
}

// Function to insert nodes into the tree
Node* insertNode(Node* root, int data) {
    if (root == NULL) {
        root = createNode(data);
    } else {
        if (root->data > data)
            root->left = insertNode(root->left, data);
        else
            root->right = insertNode(root->right, data);
    }
    return root;
}

// Function to find the closest node
void closestNode(Node* root, double target, double* diff, int* ans) {
    if (root == NULL)
        return;

    if (*diff > fabs(root->data - target)) {
        *diff = fabs(root->data - target);
        *ans = root->data;
    }

    if (target < root->data)
        closestNode(root->left, target, diff, ans);
    else if (target > root->data)
        closestNode(root->right, target, diff, ans);
}

int main() {
    Node* root = NULL;
    int n;

    printf("Enter the number of nodes: ");
    scanf("%d", &n);

    printf("Enter the values of the nodes in level order: \n");
    for(int i = 0; i < n; i++) {
        int data;
        scanf("%d", &data);
        root = insertNode(root, data);
    }

    double target;
    printf("Enter the target value: ");
    scanf("%lf", &target);

    double diff = __DBL_MAX__;
    int ans = 0;

    closestNode(root, target, &diff, &ans);
    printf("Closest number = %d\n", ans);

    return 0;
}
