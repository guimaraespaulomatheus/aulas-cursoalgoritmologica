#include <stdio.h>
int main()
{
    float salario ;
    int idade ;
    char nome [10] ;
    
    printf("Qual o seu salario?.:") ;
    scanf("%f",&salario) ;
    printf("Qual a sua idade?.:") ;
    scanf("%d",&idade) ;
    printf("Qual o seu nome.:") ;
    scanf("%s",nome) ;

    printf("O salario = %f",salario) ;
    printf("A idade = %d",idade) ;
    printf("O nome = %s",nome) ;

}