#include <stdio.h>
#include <stdlib.h>
#include <pthread.h> 


void *thread_islevi(void *arg) {
    int *id = (int *)arg;
    printf("Thread %d çalışıyor...\n", *id);
    return NULL;
}

int main() {
    pthread_t thread1, thread2;
    int id1 = 1, id2 = 2;

    

    if (pthread_create(&thread1, NULL, thread_islevi, &id1) != 0) {
        perror("Thread 1 oluşturulamadı");
        return 1;
    }

    if (pthread_create(&thread2, NULL, thread_islevi, &id2) != 0) {
        perror("Thread 2 oluşturulamadı");
        return 1;
    }

    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);

    printf("Tüm threadler işini bitirdi. Ana program sonlanıyor.\n");
    return 0;
}