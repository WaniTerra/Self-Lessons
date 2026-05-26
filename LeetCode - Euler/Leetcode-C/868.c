#include <stdio.h>
#include <stdlib.h>
int binaryGap(int n) {
    int maxDist = 0;   
    int last = -1;     
    int i = 0;        
    while (n > 0) {
        if ((n & 1) == 1) {
            
            if (last != -1) {
                int mesafe = i - last;
                
                if (mesafe > maxDist) {
                    maxDist = mesafe;
                }
            }
            
            last = i;
        }

        n = n >> 1;
        i++; 
    }

    return maxDist;
}

int main() {
    
    printf("%d", binaryGap(5));
    
    return 0;
}