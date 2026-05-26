#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Enter a array size : ");
    int size = 0;
    scanf("%d", &size);

    int *arr = calloc(size, sizeof(int));

    for (int i = 0; i < size; i++)
    {
        arr[i] = i;
    }

    for (int i = 0; i < size; i++)
    {
        printf("%d , ", arr[i]);
    }
    printf("\n");

    printf("Extend or decrase your array : ");
    scanf("%d", &size);
    
    int *temp;
    temp = realloc(arr, (size * sizeof(int)));

    if (temp != NULL)
    {
        arr = temp;
    }

    for (int i = 0; i < size; i++)
    {
        arr[i] = i;
    }

    for (int i = 0; i < size; i++)
    {
        printf("%d , ", arr[i]);
    }
}