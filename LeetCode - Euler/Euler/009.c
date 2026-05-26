#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int number = 0;
    long long result = 1;
    for (int a = 0; a < 1000; a++)
    {
        for (int b = a + 1; b < 1000; b++)
        {
            number = pow(a,2) + pow(b,2);

            if (a + b + sqrt(number) == 1000)
            {
                result = a * b * sqrt(number);
                break;
            }
            
        }
    }
    printf("%lld \n", result);
    return 0;
}