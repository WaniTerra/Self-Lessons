#include <stdio.h>

int searchInsert(int *nums, int numsSize, int target)
{
    

    for (int i = 0; i < numsSize; i++)
    {
        if (*(nums + i) == target)
        {

            return i;
        }

         
        if (nums[i] >=target &&  i == numsSize - 1)
        {
            return i;
        }

        if (*(nums + i) != target && i == numsSize - 1)
        {

            return i + 1;
        }

       if (nums[i] >= target)
        {
            return i;
        }
       
        
    }
    return -1;
}

int main()
{
    int arr[] = {1, 3, 5, 6};
    printf("%d", searchInsert(arr, 4, 7));
}