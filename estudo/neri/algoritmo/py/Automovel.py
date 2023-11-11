custo_fabrica = float(input("Digite o custo de fabrica"))

perc_revendedor = 25 * custo_fabrica / 100
impostos = 45 * custo_fabrica / 100
preco_final = custo_fabrica + perc_revendedor + impostos
print(f"O custo de fabrica foi: {custo_fabrica}, O percentual do revendedor foi: {perc_revendedor}, Os impostos: {impostos}, O preco final foi: {preco_final}")