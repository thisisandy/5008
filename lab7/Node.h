//
// Created by Andy Hu on 6/28/23.
//

#ifndef INC_5008_NODE_H
#define INC_5008_NODE_H
#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int value;
    struct node * left;
    struct node * right;
} Node;


Node * createNode(int value){
    Node * node = (Node *)malloc(sizeof(Node));
    node->value = value;
    node->left = NULL;
    node->right = NULL;
    return node;
}

#endif //INC_5008_NODE_H


