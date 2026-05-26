#include <stdio.h>
#include <stdlib.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

struct TreeNode* newNode(int val) {
    struct TreeNode* node = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    node->val = val;
    node->left = NULL;
    node->right = NULL;
    return node;
};

int countNodes(struct TreeNode* root) {
  
     if (root == NULL)
    {
        return 0;
    }

    int solDerinlik = countNodes(root->left);
    int sagDerinlik = countNodes(root->right);

    return solDerinlik + sagDerinlik + 1;
}


int main() {
   
    
    struct TreeNode* root = newNode(1);
    root->left = newNode(2);
    root->right = newNode(3);
    root->left->left = newNode(4);
    root->left->right = newNode(5);
    root->right->right = newNode(6);

    printf("Agactaki toplam dugum sayisi: %d", countNodes(root));

    return 0;
}