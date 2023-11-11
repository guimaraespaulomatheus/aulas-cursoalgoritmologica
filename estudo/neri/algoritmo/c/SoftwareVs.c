#include <stdio.h>
int main(){
    float salario, qtd_softw_vend, salario_total;
    salario = 500;
    printf("Informe a quantidade de vendas:");
    scanf("%f",&qtd_softw_vend);
    qtd_softw_vend = qtd_softw_vend * 50;
    salario_total = salario + qtd_softw_vend;
    printf("O salario total foi de: = %f",salario_total);
}