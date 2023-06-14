//
// Created by Andy Hu on 6/14/23.
//
#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
} Node;



Node * reverse(Node * node){
    if (node == NULL || node->next == NULL) {
        return node;
    }
    Node * newHead = reverse(node->next);
    node->next->next = node;
    node->next = NULL;
    return newHead;
}

void printLinkNode(Node * node) {
    while(node != NULL) {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
}

int main() {
    int n=0;

    printf("Input the number of nodes: ");
    scanf("%d", &n);
    Node * head = &(Node){0, NULL};
    Node * prev = head;
    while(n--) {
        int data;
        printf("Input the data of node: ");
        scanf("%d", &data);
        Node * node = (Node *)malloc(sizeof(Node));
        node->data = data;
        prev->next = node;
        prev = node;
    }
    head = head->next;
    printf("Original list: ");
    printLinkNode(head);
    printf("Reversed list: ");
    printLinkNode(reverse(head));
    return 0;
}