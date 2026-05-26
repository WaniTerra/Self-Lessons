#include <stdio.h>
#include <stdlib.h>

int missingNumber(int* nums, int numsSize) {
    int all = 0;
    int tempAll = 0;
    for (int i = 0; i < numsSize; i++)
    {
        all += *(nums + i);
        
    }
    
    for (int i = 0; i < numsSize + 1; i++)
    {
        tempAll += i;
    }
    
    return tempAll - all ;


}


int main() {
    
    int arr[] = {9,6,4,2,3,5,7,0,1};
    printf("%d", missingNumber(arr,9));
    return 0;
}