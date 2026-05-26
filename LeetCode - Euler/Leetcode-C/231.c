#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
bool isPowerOfTwo(int n)
{
    if (n <= 0)
        return false;
    int s = 0;

    for (int i = 0; i < 32; i++)
    {
        if ((n & 1) == 1)
        {
            s++;
            if (s == 2)
            {
                return false;
            }
        }

        n = n >> 1;
    }
    return true;
}
int main()
{
    printf("%s", isPowerOfTwo(17) ? "true" : "false");
    return 0;
}