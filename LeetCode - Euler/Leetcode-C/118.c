#include <stdio.h>
#include <stdlib.h>

int **generate(int numRows, int *returnSize, int **returnColumnSizes)
{
    *returnSize = numRows;
    *returnColumnSizes = (int *)malloc(numRows * sizeof(int));

    int **result = (int **)malloc(numRows * sizeof(int *));

    for (int i = 0; i < numRows; i++)
    {

        result[i] = (int *)malloc((i + 1) * sizeof(int));

        (*returnColumnSizes)[i] = i + 1;

        for (int j = 0; j < i + 1; j++)
        {

            if (j == 0 || j == i)
            {
                result[i][j] = 1;
            }
            else
            {
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
            }
        }
    }

    return result;
}

int main()
{
    int numRows = 8;
    int returnSize;
    int *returnColumnSizes;

    int **arr = generate(numRows, &returnSize, &returnColumnSizes);

    for (int i = 0; i < returnSize; i++)
    {
        for (int j = 0; j < returnColumnSizes[i]; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}