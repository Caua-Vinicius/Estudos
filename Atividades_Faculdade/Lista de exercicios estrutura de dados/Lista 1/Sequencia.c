#include <stdio.h>

int main() {
    int n, i = 1;


    printf("Digite um valor inteiro: ");
    scanf("%d", &n);


    printf("Sequencia em ordem crescente: ");
    while (i <= n) {
        printf("%d ", i);
        i++;
    }

    return 0;
}
