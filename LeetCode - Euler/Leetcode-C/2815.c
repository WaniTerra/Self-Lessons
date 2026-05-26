#include <stdio.h>

int maxSum(int *nums, int numsSize)
{
    int biggestNumber[numsSize][2];

    for (int i = 0; i < numsSize; i++)
    {
        int maxDigit = 0;
        int temp = *(nums + i);

        if (temp < 0)
            temp = -temp;

        while (temp > 0)
        {
            int digit = temp % 10;
            if (digit > maxDigit)
                maxDigit = digit;
            temp /= 10;
        }
        biggestNumber[i][0] = *(nums + i);
        biggestNumber[i][1] = maxDigit;
    }

    for (int i = 0; i < numsSize - 1; i++)
    {
        for (int j = i + 1; j < numsSize; j++)
        {
            if (biggestNumber[j][1] > biggestNumber[i][1])
            {
                for (int k = 0; k < 2; k++)
                {
                    int temp = biggestNumber[i][k];
                    biggestNumber[i][k] = biggestNumber[j][k];
                    biggestNumber[j][k] = temp;
                }
            }
        }
    }

    int resultArray[numsSize];
    int a2 = 0; 

    for (int i = 0; i < numsSize - 1; i++)
    {
        if (biggestNumber[i][1] == biggestNumber[i + 1][1])
        {
            resultArray[a2] = biggestNumber[i][0] + biggestNumber[i + 1][0];
            i++;
            a2++;
        }
    }

    if (a2 == 0)
        return -1;

 
    for (int i = 0; i < a2 - 1; i++)
    {
        for (int j = i + 1; j < a2; j++)
        {
            if (resultArray[j] > resultArray[i])
            {
                int temp = resultArray[i];
                resultArray[i] = resultArray[j];
                resultArray[j] = temp;
            }
        }
    }

    return resultArray[0];
}

int main()
{

    int arr[] = {2536,1613,3366,162};


    printf("%d \n", maxSum(arr,3));
}