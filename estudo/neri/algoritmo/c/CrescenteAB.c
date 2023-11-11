#include <stdio.h>
int main(){
    int a,b;
    printf("\n Digite o valor de A: ");
    scanf("%d",&a);
    printf("\n Digite o valor de B: ");
    scanf("%d",&b);
    if (a > b)
        printf("Em ordem crescente A=%d - B=%d",b,a);
    else
        printf("Em ordem crescente B=%d - A=%d",a,b);
}