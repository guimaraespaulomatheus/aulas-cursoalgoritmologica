#include <stdio.h>
int main(){
    float salario, venda, comissao;
    salario = 800;
    printf("Informe o valor da venda:");
    scanf("%f",&venda);
    comissao = (15 * venda) /100;
    salario = salario + comissao;
    printf("A venda foi de: %f",venda);
    printf("A comissao foi de: %f",comissao);
    printf("O valor do salario foi de: %f",salario);
    
}
