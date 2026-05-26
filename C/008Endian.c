#include <stdio.h>

int main() {
    unsigned int x = 1; // Hex karşılığı: 0x00000001
    

    char *c = (char*) &x;
    

    if (*c == 1) {
        printf("Sisteminiz: LITTLE ENDIAN\n");
        // Bellekteki dizilim: [01] [00] [00] [00]
        // İlk bayt 1 olduğu için Little Endian.
    } else {
        printf("Sisteminiz: BIG ENDIAN\n");
        // Bellekteki dizilim: [00] [00] [00] [01]
        // İlk bayt 0 olduğu için Big Endian.
    }

    return 0;
}