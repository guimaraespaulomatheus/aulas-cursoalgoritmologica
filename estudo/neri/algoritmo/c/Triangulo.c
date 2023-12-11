#include <stdio.h>
int main(){
    float li, ld, le;
    printf("Digite o comprimento: ");
    scanf("%f",&li);
    printf("Digite o comprimento: ");
    scanf("%f",&ld);
    printf("Digite o comprimento: ");
    scanf("%f",&le);
    if ((li < (le + ld)) && (le < (ld + li)) && (ld < (li + le)))
            if ((le == ld) && (le == li))
                printf("Triangulo equilatero");
            else if ((li == ld) || (li == le) || (le = ld))
                printf("Triangulo isosceles");
            else
                printf("Triangulo escaleno");
    else
        printf("Nao e um triangulo");
}