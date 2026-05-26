#include <stdio.h>

int main()
{

    unsigned long long result = 0;

for (int i = 1; i <= 179000; i++)
{
    if (i % 2 != 0)
    {
        result += (unsigned long long)i * i;
    }
    
}

printf("%llu \n", result);

}