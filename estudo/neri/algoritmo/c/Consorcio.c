#include <stdio.h>
int main(){
    float total_prest, qtd_prest_pagas, valor_prest, total_prest_pagas, saldo_devedor;
    printf("Informe a quantidade de parcelas: ");
    scanf("%f",&total_prest);
    printf("Informe a quantidade de parcelas pagas: ");
    scanf("%f",&qtd_prest_pagas);
    printf("Informe o valor das parcelas: ");
    scanf("%f",&valor_prest);
    total_prest_pagas = valor_prest * qtd_prest_pagas;
    saldo_devedor = valor_prest * (total_prest - qtd_prest_pagas);
    printf("\n O total de prestacoes pagas foi de: = %f",total_prest_pagas);
    printf("\n O saldo devedor ficou de: = %f",saldo_devedor);
}
   