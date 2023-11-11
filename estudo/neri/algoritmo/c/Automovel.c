#include <stdio.h>
int main()
{
    float custo_fabrica, perc_revendedor, impostos, preco_final;
    custo_fabrica = 40000;
    perc_revendedor = (25 * custo_fabrica) / 100;
    impostos = (45 * custo_fabrica) / 100;
    preco_final = custo_fabrica + perc_revendedor + impostos;
    printf("\n O custo de fabrica = %f", custo_fabrica);
    printf("\n O percentual do revendedor = %f", perc_revendedor);
    printf("\n Os impostos = %f", impostos);
    printf("\n O valor final = %f", preco_final);
}