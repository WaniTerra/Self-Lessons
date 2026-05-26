#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    long long t1 = 0;
    long long t2 = 0;
    for (int i = 1; i <= 100; i++)
    {
        t1 += pow(i,2);
        t2 += i;
    }

    t2 = pow(t2,2);

    printf("%lld \n", t2-t1);

    return 0;
}