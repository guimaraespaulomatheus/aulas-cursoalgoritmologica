#include <stdio.h>
int main(){
    
    float valor_compra, valor_desconto, valor_pagar;
    int percentual_desconto;
    char nome[30];

    printf("Informe seu nome: ");
    scanf("%s",nome);
    printf("Informe o valor da compra: ");
    scanf("%f",&valor_compra);
    
    if (valor_compra <= 200)
        percentual_desconto = 10;
    else if (valor_compra <=500)
        percentual_desconto = 15;
    else
        percentual_desconto = 20;
    
    valor_desconto = (valor_compra * percentual_desconto) /100;
    valor_pagar = valor_compra - valor_desconto;

    printf("\n O nome do cliente é: = %s",nome);
    printf("\n O valor da compra foi de: = %f",valor_compra);
    printf("\n O percentual de desconto ficou de: = %d",percentual_desconto);
    printf("\n O desconto ficou de: = %f",valor_desconto);
    printf("\n O valor total ficou de: = %f",valor_pagar);
}