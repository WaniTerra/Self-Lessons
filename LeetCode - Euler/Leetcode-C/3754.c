#include <stdio.h>
#include <stdlib.h>

long long sumAndMultiply(int n)
{
    char arr[11];
    char arr2[11];
    long long result = 0;
    long long sum = 0;

    sprintf(arr, "%lld", n);

    for (int i = 0, j = 0; i < 10; i++)
    {
        if (arr[i] == '\0')
        {
            arr2[j] = '\0';
            break;
        }

        if (arr[i] != '0')
        {
            arr2[j] = arr[i];
            j++;
        }
    }

    result = atoi(arr2);
    

    for (int i = 0; i < 10; i++)
    {
        if (arr2[i] == '\0')
        {
            break;
        }

        sum += arr2[i] - '0';
    }
    
    return result * sum;
}
int main()
{
    long long result = sumAndMultiply(10203004);

    printf("%d \n", result);

}