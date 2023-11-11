#include <stdio.h>
int main(){
    float saldo, cheque_entrou, saldo_final;
    saldo = 500;
    printf(" Digite o valor do cheque que entrou.: ");
    scanf("%f",&cheque_entrou);
    saldo_final = saldo - cheque_entrou;
    printf("\nInforme o saldo: %f",saldo);
    printf("\nInforme o saldo final: %f",saldo_final);
}
