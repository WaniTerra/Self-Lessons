#include <stdio.h>
#include <stdlib.h>
#include <string.h>
char *longestCommonPrefix(char **strs, int strsSize)
{
    
    if (strsSize == 0) {
        char *bos = malloc(1);
        bos[0] = '\0';
        return bos;
    }

    char *result = malloc(200 * sizeof(char));

    
    if (strsSize == 1) {
        strcpy(result, strs[0]);
        return result;
    }

    int i = 0;
    int fin = 0;

    for (i = 0; i < 200; i++)
    {
        
        char a1 = strs[0][i]; 

      
        if (a1 == '\0') {
            break;
        }

        for (int j = 1; j < strsSize; j++) 
        {
            char a2 = strs[j][i]; 

            if (a1 != a2)
            {
                fin = 1;
                break;
            }
        }

        if (fin == 1)
        {
            break;
        }

        result[i] = a1;
    }

    result[i] = '\0'; 
    return result;
}

int main()
{
    char *arr[] = {"",""};
    char *sonuc = longestCommonPrefix(arr, 1);
    printf("%s", sonuc);

    return 0;
}