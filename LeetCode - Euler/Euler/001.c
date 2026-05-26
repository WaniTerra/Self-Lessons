#include <stdio.h>

int main(){
    long long result = 0;
    for (int i = 0; i < 1000; i++)
    {
        if ((i % 5 == 0) || (i % 3 == 0))
        {
            result += i;
        }
        
    }
    printf("%lld \n", result);
}