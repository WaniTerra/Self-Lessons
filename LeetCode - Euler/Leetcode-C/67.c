#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void reverse(char *str) {
    int i = 0;
    int j = strlen(str) - 1;
    while (i < j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }
}

char *addBinary(char *a, char *b) {
    int i = strlen(a) - 1;
    int j = strlen(b) - 1;
    
    int maxLen = (i > j ? i : j) + 3; 
    char *result = (char *)malloc(maxLen * sizeof(char));
    
    int k = 0;
    int carry = 0;

    while (i >= 0 || j >= 0 || carry == 1) {
        int sum = carry;

        if (i >= 0) {
            sum += a[i] - '0';
            i--;
        }
        if (j >= 0) {
            sum += b[j] - '0';
            j--;
        }

        result[k] = (sum % 2) + '0';
        k++;

        carry = sum / 2;
    }

    result[k] = '\0';

    reverse(result);

    return result;
}

int main() {
    char a[] = "1010";
    char b[] = "1011";
    
    char *res = addBinary(a, b);

    printf("%s\n", res);

    free(res); 

    return 0;
}