nome = input("nome do cliente é: ")
valor_compra = float(input("O valor ficou de: "))

if (valor_compra <= 200):
    desconto = 10
elif (valor_compra <=500):
    desconto = 15
else:
    desconto = 20

valor_desconto = (valor_compra * desconto) /100
valor_pagar = valor_compra - valor_desconto

print("O nome do cliente é: ",nome)
print(f"O valor da compra foi de: {valor_compra}")
print(f"O percentual do desconto ficou de: {desconto}")
print(f"O valor do desconto ficou de: {valor_desconto}")
print(f"O valor a pagar ficou de: {valor_pagar}")