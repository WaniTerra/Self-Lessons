#include <stdio.h>
#include <stdlib.h>

int main()
{

    

    int n = 3;
    int rev = 0;
    for (int i = 0; i < 4; i++)
    {
        rev = rev << 1; 

        if ((n & 1) == 1)
        
        {
        
            rev = rev | 1; 
        
        }

        n = n >> 1;
    }

    printf("%d", rev);

    return 0;
}