#include <stdio.h>
int main(){
    float valor_saldo, cheque_entrou;
    printf("Informe o saldo: ");
    scanf("%f",&valor_saldo);
    printf("Informe o valor do cheque: ");
    scanf("%f",&cheque_entrou);

    if (cheque_entrou <= valor_saldo)

    {  
        valor_saldo = (valor_saldo - cheque_entrou);
        printf("O valor do saldo novo é de: %f",valor_saldo);
    } 
    else
    { 
        printf("\n Atencao, Saldo insuficiente para efetuar a transacao: ");
        printf("\n Transacao negada devido a limite insuficiente %f",valor_saldo);
    }
}