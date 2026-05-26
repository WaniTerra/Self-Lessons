#include <stdio.h>
#include <string.h>

int main()
{
    FILE *file = fopen("den.txt", "w+");
    fprintf(file, "deneme yazisi");
    fclose(file);

    FILE *filer = fopen("den.txt", "r+");

    char buffer[256];
    while (fgets(buffer, sizeof(buffer), filer))
    {
        long pos = ftell(filer);
        if (buffer[0] > 'a' && buffer[0] < 'z')
        {
            printf("İlk harf küçük");
            fseek(filer, pos - strlen(buffer),SEEK_SET);
            fprintf(filer,"#");
            break;
        }
        else
        {

            fseek(filer, pos - 5,SEEK_SET);
            fprintf(filer,"#");
            printf("Büyük");
            break;

        }
    }
}