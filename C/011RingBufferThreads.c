#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>

typedef struct Data {
    char val;
    int time;
} Data;

typedef struct RingBuffer {
    Data data[5];
    int head;
    int tail;
} RingBuffer;

RingBuffer rb = {.head = 0, .tail = 0};
pthread_mutex_t mutex;

void add_new_val(char val, int time) {
    pthread_mutex_lock(&mutex);

    int next_head = (rb.head + 1) % 5;

    if (next_head == rb.tail) {
        printf("[Producer]: Buffer Full! Cannot add %c\n", val);
        pthread_mutex_unlock(&mutex);
        return;
    }

    rb.data[rb.head].val = val;
    rb.data[rb.head].time = time;
    rb.head = next_head;
    
    printf("[Producer]: %c added (Time: %d)\n", val, time);

    pthread_mutex_unlock(&mutex);
}

void read_value() {
    pthread_mutex_lock(&mutex);

    if (rb.head == rb.tail) {
        pthread_mutex_unlock(&mutex);
        return;
    }

    Data d = rb.data[rb.tail];
    rb.tail = (rb.tail + 1) % 5;
    
    printf("\t\t[Consumer]: READ -> Value: %c , Time: %d\n", d.val, d.time);

    pthread_mutex_unlock(&mutex);
}

void *producer_thread(void *arg) {
    int counter = 1;
    while (1) {
        char val;
        printf("Enter a character (exit 'o'): ");
        scanf(" %c", &val);

        if (val == 'o') break;

        add_new_val(val, counter++);
        
        usleep(1000); 
    }
    return NULL;
}

void *consumer_thread(void *arg) {
    while (1) {
        read_value();
        sleep(1); 
    }
    return NULL;
}

int main() {
    pthread_t t_prod, t_cons;
    
    pthread_mutex_init(&mutex, NULL);

    pthread_create(&t_prod, NULL, producer_thread, NULL);
    pthread_create(&t_cons, NULL, consumer_thread, NULL);

    pthread_join(t_prod, NULL);

    printf("Exiting Program...\n");
    pthread_mutex_destroy(&mutex);

    return 0;
}