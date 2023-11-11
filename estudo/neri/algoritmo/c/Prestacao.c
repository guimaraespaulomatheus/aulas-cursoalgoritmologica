#include <stdio.h>
int main(){    
    float prest, valor_prest, taxa, dias_atraso;
    printf("Informe o valor da prestacao: ");
    scanf("%f",&valor_prest);
    printf("Informe a taxa de juros: ");
    scanf("%f",&taxa);
    printf("Informe a quantidade de dias em atraso: ");
    scanf("%f",&dias_atraso);
    prest = valor_prest + (valor_prest * (taxa /100) * dias_atraso);
    printf("O valor corrigido da prestacao ficou de: = %f",prest);
}