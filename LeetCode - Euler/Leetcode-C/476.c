#include <stdio.h>
#include <stdlib.h>

int findComplement(int num)
{
    
    long mask = 1;
    
    while (mask <= num) {
        mask = mask << 1;
    }
    
    return num ^ (mask - 1);
}

int main()
{
    printf("%d", findComplement(5));

    return 0;
}