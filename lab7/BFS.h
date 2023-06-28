//
// Created by Andy Hu on 6/28/23.
//

#ifndef INC_5008_BFS_H
#define INC_5008_BFS_H

#include <stdio.h>
#include <stdlib.h>
#include "Node.h"


void BFS(Node * root){
    if (root == NULL){
        return;
    }
    Node ** queue = (Node **)malloc(sizeof(Node *) * 100);
    int head = 0;
    int tail = 0;
    queue[tail] = root;
    tail ++;
    while (head < tail){
        Node * node = queue[head];
        head ++;
        printf("%d ", node->value);
        if (node->left != NULL){
            queue[tail] = node->left;
            tail ++;
        }
        if (node->right != NULL){
            queue[tail] = node->right;
            tail ++;
        }
    }
    free(queue);
}


#endif //INC_5008_BFS_H
