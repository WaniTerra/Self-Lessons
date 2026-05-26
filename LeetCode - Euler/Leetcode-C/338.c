#include <stdio.h>
#include <stdlib.h>

int *countBits(int n, int *returnSize)
{
    *returnSize = n + 1;

    int *a;
    a = malloc((n + 1) * sizeof(int));

    for (int i = 0; i < n + 1; i++)
    {
        int res = 0;
        int temp = i;

        for (int j = 0; j < 32; j++)
        {
            
            if ((temp & 1) == 1) 
            {
                res++;
            }
            temp = temp >> 1; 
        }

     
        *(a + i) = res; 
    }

    return a;
}

int main()
{

    int n = 5;

    int gelenBoyut = 0;
    int *sonucDizisi = countBits(n, &gelenBoyut);
    for (int i = 0; i < gelenBoyut; i++)
    {
        printf("%d ", sonucDizisi[i]);
    }
    free(sonucDizisi);

    return 0;
}