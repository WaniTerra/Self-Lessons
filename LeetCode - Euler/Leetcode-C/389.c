#include <stdio.h>
#include <stdlib.h>

char findTheDifference(char *s, char *t)
{
    int i = 0;
    int j = 0;
    int frS = 0;
    int frT = 0;
    while (*(s + i) != '\0')
    {

        frS += *(s + i);
        i++;
    }

    while (*(t + j) != '\0')
    {
        frT += *(t + j);
        j++;
    }

    frS = frS - frT;

    return (frS < 0) ? (char)(frS * -1) : (char)frS;
}

char findTheDifference2(char *s, char *t){
    int result = 0;
    while (*s)
    {
        result ^= *s;
        s++;
    }
      while (*t)
    {
        result ^= *t;
        t++;
    }

    return result;
}


int main()
{

    char s[] = "abcd";
    char t[] = "abcde";

    printf("%c", findTheDifference2(s, t));

    return 0;
}