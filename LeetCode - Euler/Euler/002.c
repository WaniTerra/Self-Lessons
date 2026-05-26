#include <stdio.h>

int main()
{
    int first = 1;
    int second = 1;
    int result = 0;
    while (1)
    {

        int fibo = first + second;
        if (fibo > 4000000)
        {
            break;
        }
        first = second;
        second = fibo;

        if (fibo % 2 == 0)
        {
            result += fibo;
        }
    }


    printf("%d \n", result);
}