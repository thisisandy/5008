//
// Created by Andy Hu on 7/8/23.
//

#include<stdio.h>
#include<stdlib.h>

typedef struct node {
    int data;
    int priority;
    struct node* next;
} Node;

// Function to create a new node
Node* newNode(int data, int priority) {
    Node* temp = (Node*)malloc(sizeof(Node));
    temp->data = data;
    temp->priority = priority;
    temp->next = NULL;

    return temp;
}

int isEmpty(Node** head) {
    return (*head) == NULL;
}

void enqueue(Node** head, int data, int priority) {
    Node* temp = newNode(data, priority);
    if(*head == NULL || (*head)->priority > priority) {
        temp->next = *head;
        (*head) = temp;
    } else {
        Node* start = (*head);
        while(start->next != NULL && start->next->priority < priority) {
            start = start->next;
        }
        temp->next = start->next;
        start->next = temp;
    }
}

void dequeue(Node** head) {
    if(isEmpty(head)) {
        printf("Underflow: The queue is empty.\n");
        return;
    }
    Node* temp = *head;
    (*head) = (*head)->next;
    printf("Removed: %d\n", temp->data);
    free(temp);
}

void display(Node** head) {
    Node* start = (*head);

    if(isEmpty(head)) {
        printf("Queue is empty.\n");
        return;
    }
    while(start != NULL) {
        printf("%d ", start->data);
        start = start->next;
    }
    printf("\n");
}

int main() {
    Node* pq = NULL;
    int flag = 1;
    do {
        printf("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
        int choice, data, priority;
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch(choice) {
            case 1:
                printf("Enter data and priority: ");
                scanf("%d %d", &data, &priority);
                enqueue(&pq, data, priority);
                break;
            case 2:
                dequeue(&pq);
                break;
            case 3:
                display(&pq);
                break;
            case 4:
                flag = 0;
                break;
            default:
                printf("Invalid choice.\n");
        }
    } while(flag);

    return 0;
}
