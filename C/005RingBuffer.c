#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct Data
{
    char val;
    int time;
} Data;

typedef struct RingBuffer
{
    Data datas[4];
    int head;
    int tail;
} RingBuffer;

void createRingbuffer(RingBuffer *rb)
{
    rb->head = 0;
    rb->tail = 0;
}

bool createData(char *a1, int *time, RingBuffer *rb)
{
    int next_head = (rb->head + 1) % 4;

    if (next_head == rb->tail)
    {
        return false;
    }

    Data data = {*a1, *time};

    rb->datas[rb->head] = data;
    rb->head = next_head; 
    
    return true;
}

bool readRingBuffer(RingBuffer *rb, char *val)
{
    if (rb->head == rb->tail)
    {
        return false;
    }

    *val = rb->datas[rb->tail].val;

    rb->tail = (rb->tail + 1) % 4;

    return true;
}

int main()
{
    RingBuffer rb;
    createRingbuffer(&rb);

    char a;
    char ra = 'b';
    int time = 3;

    createData(&ra, &time, &rb);

    if (readRingBuffer(&rb, &a)) 
    {
        printf(": %c\n", a);
    }

    return 0;
}