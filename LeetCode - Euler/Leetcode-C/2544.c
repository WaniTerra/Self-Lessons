#include <stdio.h>

int alternateDigitSum(int n)
{
    char arr[11];
    int result = 0;

    int size = sprintf(arr, "%d", n);

    for (int i = 0; i < size; i++)
    {
        int num = arr[i] - '0';
        if (i % 2 == 0)
            result += num;

        else
            result += -(num);
        }

    return result;
}

int main()
{
    int a = alternateDigitSum(886996);
    printf("%d ", a);
}