#include <stdio.h>
#define TAMANHO 10

int fila[TAMANHO];
int frente = -1, fim = -1;

void enqueue(int item) {
    if ((frente == 0 && fim == TAMANHO - 1) || (frente == fim + 1)) {
        printf("A fila está cheia\n");
    } else {
        if (frente == -1) {
            frente = fim = 0;
            fila[fim] = item;
        } else if (fim == TAMANHO - 1) {
            fim = 0;
            fila[fim] = item;
        } else {
            fim++;
            fila[fim] = item;
        }
    }
}

int dequeue() {
    if (frente == -1) {
        printf("A fila está vazia\n");
        return 0;
    } else {
        int item = fila[frente];
        if (frente == fim) {
            frente = -1;
            fim = -1;
        } else if (frente == TAMANHO - 1) {
            frente = 0;
        } else {
            frente++;
        }
        return item;
    }
}

int main() {
    int elementos[] = {64, 25, 12, 22, 11, 9};
    int quantidade_elementos = sizeof(elementos) / sizeof(elementos[0]);

    for (int i = 0; i < quantidade_elementos; i++) {
        enqueue(elementos[i]);
    }

    printf("Elementos removidos da fila: ");
    for (int i = 0; i < quantidade_elementos; i++) {
        printf("%d ", dequeue());
    }

    return 0;
}