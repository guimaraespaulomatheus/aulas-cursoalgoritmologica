#include <stdio.h>
int main()
{

    int A, B, Auxiliar;
    A = 5;
    B = 10;
    Auxiliar = A;
    A = B;
    B = Auxiliar;
    printf("A = %d",A);
    printf("B = %d",B);
}