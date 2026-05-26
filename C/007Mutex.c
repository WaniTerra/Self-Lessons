#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <windows.h>
int sumBalance = 0;
int dep1 = 200;
int dep2 = 300;
pthread_mutex_t mutex;

int read_balance()
{
    return sumBalance;
}

void write_balance(int new_balance)
{
    Sleep(1000);
    sumBalance = new_balance;
}

void *writeBalance(void *arg)
{
    pthread_mutex_lock(&mutex);

    int amount = *((int *)arg);

    int currentBalance = read_balance();

    currentBalance += amount;

    write_balance(currentBalance);

    pthread_mutex_unlock(&mutex);

    return NULL;
}

int main()
{
    pthread_t t1, t2;

    pthread_mutex_init(&mutex, NULL);

    pthread_create(&t1, NULL, writeBalance, (void *)&dep1);
    pthread_create(&t2, NULL, writeBalance, (void *)&dep2);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    pthread_mutex_destroy(&mutex);

    printf("Sonuc: %d\n", sumBalance);

    return 0;
}