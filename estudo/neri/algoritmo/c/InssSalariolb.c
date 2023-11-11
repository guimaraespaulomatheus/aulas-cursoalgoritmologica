#include <stdio.h>
int main(){
    float salario_bruto, inss, salario_liquido;
    char nome[50];
    printf("\n Informe o seu nome:");
    scanf("%s",nome);
    printf("\n Informe seu salario bruto");
    scanf("%f",&salario_bruto);
    inss = salario_bruto * 9 /100;
    salario_liquido = salario_bruto - inss;
    printf("\n Seu nome: %s",nome);
    printf("\n O valor do seu salario bruto foi de: %f",salario_bruto);
    printf("\n O valor descontado do inss foi de: %f",inss);
    printf("\n Seu salario liquido foi de: %f",salario_liquido);
}
