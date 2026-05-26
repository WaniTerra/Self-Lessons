#include <stdio.h>

int main() {
    long long a = 0;

   
    for (int i = 2; i < 2000000; i++) 
    {
        int isPrime = 1; 

        for (int j = 2; j * j <= i; j++) 
        {
            if (i % j == 0) 
            {
                isPrime = 0; 
                break;
            }
        }

     
        if (isPrime) 
        {
            a += i;
        }
    }

    printf("%lld", a);
    return 0;
}