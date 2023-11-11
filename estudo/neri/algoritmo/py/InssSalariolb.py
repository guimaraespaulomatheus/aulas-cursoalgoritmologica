nome = input("\n Informe seu nome")
salario_bruto = float(input("\n Informe seu salario"))
inss = salario_bruto * 9 /100
salario_liquido = salario_bruto - inss
print("\n Nome: ",nome)
print(f"\n Seu salario bruto foi de: ",salario_bruto)
print(f"\n O valor do inss foi de: ",inss)
print(f"\n O seu salario liquido foi de: ",salario_liquido)