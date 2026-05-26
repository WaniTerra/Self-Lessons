#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
    int control = 1; 
    long long i = 1;

    while (1)
    {
        i += 2; 
        bool isPrime = true;

        
        for (long long j = 3; j * j <= i; j += 2)
        {
            if (i % j == 0)
            {
                isPrime = false;
                break;
            }
            
           
        }

      
        if (isPrime)
        {
            control++;
        }

        if (control == 10001)
        {
            break;
        }
    }

    printf("%lld \n", i);

    return 0;
}