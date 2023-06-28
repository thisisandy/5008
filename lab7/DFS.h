

#ifndef BFS_H
#define BFS_H

#include <stdio.h>
#include <stdlib.h>
#include "Node.h"

void preOrder(Node * root){
    if (root == NULL){
        return;
    }
    printf("%d ", root->value);
    preOrder(root->left);
    preOrder(root->right);
}


void inOrder(Node * root){
    if (root == NULL){
        return;
    }
    inOrder(root->left);
    printf("%d ", root->value);
    inOrder(root->right);
}


void postOrder(Node * root){
    if (root == NULL){
        return;
    }
    postOrder(root->left);
    postOrder(root->right);
    printf("%d ", root->value);
}

#endif //INC_5008_BFS_H

