#include <stdio.h>
#include <stdlib.h>

int removeDuplicates(int *nums, int numsSize)
{

    if (numsSize == 0)
        return 0;

    int j = 1;
    for (int i = 0; i < numsSize - 1; i++)
    {
        if (*(nums + i) != *(nums + i + 1))
        {
            *(nums + j) = *(nums + i + 1);
            j++;
        }
    }

    return j;
}
int main()
{

    int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int rem = removeDuplicates(arr, 10);

    return 0;
}