#include <stdio.h>
#include <stdlib.h>

int main()
{
    long long number = 600851475143;
    long long biggetN;

    while (number % 2 == 0)
    {
        number = number / 2;
        biggetN = 2;
    }

    for (long long i = 3; i * i <= number; i++)
    {
        while (number % i == 0)
        {
            biggetN = i;         
            number = number / i; 
        }
    }

    if (number > 0)
    {
        biggetN = number;
    }

    printf("%ld", biggetN);

    return 0;
}