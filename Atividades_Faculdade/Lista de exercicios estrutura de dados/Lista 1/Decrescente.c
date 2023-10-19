#include <stdio.h>

int main() {
    int n, i;
    int soma = 0;


    printf("Digite um valor inteiro: ");
    scanf("%d", &n);


    printf("Sequencia em ordem decrescente: ");
    for (i = n; i >= 1; i--) {
        printf("%d ", i);
        soma += i; 
    }

    printf("\nSoma dos termos: %d\n", soma);

    return 0;
}
