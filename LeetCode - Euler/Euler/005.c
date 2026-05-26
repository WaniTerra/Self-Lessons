#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number = 20;
    int alls = 0;
    while (1)
    {
        alls = 0;
        number += 2;
        for (int i = 2; i < 20; i++)
        {
            if (number % i != 0)
            {
                alls = i;
                break;
            }
        }

        if (alls == 0)
        {
            break;
        }
        

    }

    printf("%d \n", number);

    return 0;
}