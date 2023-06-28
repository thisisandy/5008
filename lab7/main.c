//
// Created by Andy Hu on 6/28/23.
//
#include "Node.h"
#include "DFS.h"
#include "BFS.h"

int main(){
    Node * root = createNode(1);
    root->left = createNode(2);
    root->right = createNode(3);
    root->left->left = createNode(4);
    root->left->right = createNode(5);
    root->right->left = createNode(6);
    root->right->right = createNode(7);
    root->left->left->left = createNode(8);
    root->left->left->right = createNode(9);
    root->left->right->left = createNode(10);
    root->left->right->right = createNode(11);
    root->right->left->left = createNode(12);
    root->right->left->right = createNode(13);
    root->right->right->left = createNode(14);
    root->right->right->right = createNode(15);
    printf("Preorder:\n\n");
    preOrder(root);
    printf("\n\nInorder:\n\n");
    inOrder(root);
    printf("\n\nPostorder:\n\n");
    postOrder(root);
    printf("\n");
    printf("\nBFS:\n\n");
    BFS(root);
}