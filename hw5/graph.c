//
// Created by Andy Hu on 7/19/23.
//

#include <stdio.h>
#define SIZE 9

int queue[SIZE];
int front = 0;
int rear = -1;
int queueItemCount = 0;

int adjMatrix[SIZE][SIZE] = {
        {0, 1, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 1, 0, 1, 0, 0, 0,0},
        {0, 0, 0, 0, 0, 1, 0, 0,0},
        {0, 0, 0, 0, 1, 0, 1, 0,0},
        {0, 0, 0, 0, 0, 0, 0, 1,0},
        {0, 0, 0, 0, 0, 0, 0, 0,1},
        {0, 0, 0, 0, 0, 0, 0, 1,0},
        {0, 0, 0, 0, 0, 0, 0, 0,1},
        {0, 0, 0, 0, 0, 0, 0, 0,0}
};

int visited[SIZE];

void enqueue(int data) {
    queue[++rear] = data;
    queueItemCount++;
}

int dequeue() {
    queueItemCount--;
    return queue[front++];
}

int isQueueEmpty() {
    return queueItemCount == 0;
}

void BFS(int startVertex) {
    visited[startVertex] = 1;
    printf("%d ", startVertex);
    enqueue(startVertex);

    while(!isQueueEmpty()){
        int currentVertex = dequeue();
        for(int i = 0; i < SIZE; i++) {
            if(adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                enqueue(i);
                visited[i] = 1;
                printf("%d ", i);
            }
        }
    }
}

int main() {
    for(int i = 0; i < SIZE; i++) {
        visited[i] = 0;
    }

    BFS(0);
    return 0;
}
