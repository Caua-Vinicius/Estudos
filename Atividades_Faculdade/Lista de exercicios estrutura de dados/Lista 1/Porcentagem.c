#include <stdio.h>

int main()
{
    double preco, preco_novo;
    printf("Digite o valor de um produto: ");
    scanf("%lf", &preco);

    if(preco<100){
        preco_novo = preco *1.2;
        printf("O valor do seu produto aumentou de %lf, para %lf, tendo um aumento de 20 porcento", preco, preco_novo);
    }
    else{
        preco_novo = preco *1.1;
        printf("O valor do seu produto aumentou de %lf, para %lf, tendo um aumento de 10 porcento", preco, preco_novo);
    }

    return 0;
}
