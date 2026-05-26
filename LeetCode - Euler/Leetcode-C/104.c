#include <stdio.h>
#include <stdlib.h>

struct TreeNode
{
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int maxDepth(struct TreeNode *root)
{

    if (root == NULL)
    {
        return 0;
    }

    int solDerinlik = maxDepth(root->left);
    int sagDerinlik = maxDepth(root->right);

    if (solDerinlik > sagDerinlik)
        return solDerinlik + 1;
    else
        return sagDerinlik + 1;
}

struct TreeNode *yeniDugum(int veri)
{
    struct TreeNode *node = (struct TreeNode *)malloc(sizeof(struct TreeNode));
    node->val = veri;
    node->left = NULL;
    node->right = NULL;
    return node;
}

int main()
{
    struct TreeNode *root = yeniDugum(3);
    root->left = yeniDugum(9);
    root->right = yeniDugum(20);
    root->right->left = yeniDugum(15);
    root->right->right = yeniDugum(7);

    int sonuc = maxDepth(root);

    printf("Sonuc: %d\n", sonuc);

    return 0;
}