#include <stdio.h>
int main(){
    int n1, n2, n3;
    printf("Informe o valor de n1: ");
    scanf("%d",&n1);
    printf("Informe o valor de n2: ");
    scanf("%d",&n2);
    printf("Informe o valor de n3: ");
    scanf("%d",&n3);

    if ((n1 >= n2) & (n1 >= n3))
    {
        printf("\n O valor de n1 é maior. %d",n1);
    if (n2 <= n3)
        printf("\n O valor de n2 é menor. %d",n2);
    else
        printf("\n O valor de n3 é menor. %d",n3);
    }
    if ((n2 >= n1) & (n2 >= n3)){
        printf("\n O valor de n2 é maior. %d",n2);
    if (n1 <= n3)
        printf("\n O valor de n1 é menor. %d",n1);
    else
        printf("\n O valor de n3 é menor. %d",n3);
    }
    if ((n3 >= n2) & (n3 >= n1)){
        printf("\n O valor de n3 é maior. %d",n3);
    if (n2 <= n1)
        printf("\n O valor de n2 é menor. %d",n2);
    else
        printf("\n O valor de n1 é menor. %d",n1);
    }
}