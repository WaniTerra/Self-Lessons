#include <stdio.h>
#include <stdlib.h>

int reverseBits(int n)
{
    int res = 0;

    for (int i = 0; i < 32; i++)
    {
        res = res << 1;

        res = res | (n & 1);

        n = n >> 1;
    }

    return res;
}

int main()
{
    int a = reverseBits(43261596);
    printf("%d", a);
    return 0;
}