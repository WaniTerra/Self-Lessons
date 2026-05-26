#include <stdio.h>
#include <string.h>

int main()
{
    int dizi[10];
    int dizi2[10];
    for (int i = 0; i < 10; i++)
    {
        dizi[i] = i;
    }

    //memcpy(dizi2, dizi, sizeof(dizi));
    
    // memset(dizi, 0, sizeof(dizi));

    for (int i = 0; i < 10; i++)
    {
        printf("%d \n", dizi2[i]);
    }
}