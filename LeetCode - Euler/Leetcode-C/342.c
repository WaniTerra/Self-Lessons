#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
bool isPowerOfFour(int n)
{
    if (n <= 0) return false;
    
    int s = 0;

    for (int i = 0; i < 32; i++)
    {
        
        if ((n & 1) == 1)
        {
            s++; 

            if (i % 2 != 0) 
            {
                return false; 
            }
        }
        
        
        n = n >> 1;
    }

   
    return (s == 1); 
}
int main()
{
    printf("%s", isPowerOfFour(20) ? "true" : "false");
    return 0;
}