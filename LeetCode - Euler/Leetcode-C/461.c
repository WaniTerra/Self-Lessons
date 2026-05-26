#include <stdio.h>
#include <stdlib.h>

int hammingDistance(int x, int y)
{
    int res = 0;
   

    for (int i = 0; i <  32; i++)
    {
        if (((x & 1) != (y & 1)))
        {
            res++;
        }

        x = x >> 1;
        y = y >> 1;
    }
    return res ;
}

int main()
{
    printf("%d" , hammingDistance(3 , 1));
    return 0;
}