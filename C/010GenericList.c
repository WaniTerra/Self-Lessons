#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    void *data;
    struct Node *next;
} Node;

typedef struct LinkedList
{
    Node *head;
    int size;
} LinkedList;

LinkedList *createList()
{
    LinkedList *list = malloc(sizeof(LinkedList));
    if (list == NULL) return NULL;
    list->head = NULL;
    list->size = 0;
    return list;
}

void add(LinkedList *list, void *data)
{
    Node *newNode = (Node *)malloc(sizeof(Node));
    if (newNode == NULL) return;
    
    newNode->data = data;
    newNode->next = list->head;
    list->head = newNode;
    list->size++;
}

void printList(LinkedList *list, void (*printer)(void *))
{
    Node *current = list->head;
    while (current != NULL)
    {
        printer(current->data);
        current = current->next;
    }
}

void printInt(void *data) {
    printf("%d\n", *(int *)data);
}

int main()
{
    LinkedList *list = createList();

    int b = 12;
    int c = 55;
    
    add(list, &b);
    add(list, &c);

    printf("List Size: %d\n", list->size);
    
    printf("List Elements:\n");
    printList(list, printInt); 

    return 0;
}