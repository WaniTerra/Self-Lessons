#include <stdio.h>
#include <stdlib.h>

int main()
{
    int maxPalindrome = 0; // En büyük palindromu burada saklayacağız

    for (int i = 999; i >= 100; i--)
    {
        for (int j = i; j >= 100; j--)
        {
            int number = i * j;

            
            if (number <= maxPalindrome)
                break;

            int orjNumber = number;

            
            int reversed = 0;

           
            while (orjNumber > 0)
            {
                int digit = orjNumber % 10;
                reversed = reversed * 10 + digit;
                orjNumber /= 10;
            }

        
            if (number == reversed)
            {
                if (number > maxPalindrome)
                {
                    maxPalindrome = number;
                }
            }
        }
    }

    printf("%d \n", maxPalindrome);

    return 0;
}