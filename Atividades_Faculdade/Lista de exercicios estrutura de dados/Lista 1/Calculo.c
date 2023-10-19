#include <stdio.h>

int main() {
    double valor1, valor2, resultado;
    char escolha;

    printf("Digite um valor: ");
    scanf("%lf", &valor1);
    printf("Digite um valor: ");
    scanf("%lf", &valor2);

    printf("Digite uma das operacoes (1 -> +, 2 -> -, 3 -> *, 4 -> /): ");
    scanf(" %c", &escolha); 

    switch (escolha) {
        case '1':
            resultado = valor1 + valor2;
            printf("%lf + %lf = %lf", valor1, valor2, resultado);
            break;
        case '2':
            resultado = valor1 - valor2;
            printf("%lf - %lf = %lf", valor1, valor2, resultado);
            break;
        case '3':
            resultado = valor1 * valor2;
            printf("%lf * %lf = %lf", valor1, valor2, resultado);
            break;
        case '4':
            if(valor2 != 0) {
                resultado = valor1 / valor2;
                printf("%lf / %lf = %lf", valor1, valor2, resultado);
            } else {
                printf("Erro: divisão por zero.");
            }
            break;
        default:
            printf("Operação inválida.");
    }

    return 0;
}
