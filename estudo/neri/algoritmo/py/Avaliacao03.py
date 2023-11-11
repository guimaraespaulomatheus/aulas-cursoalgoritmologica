prova = float(input("Digite o valor da prova: "))
prova2 = float(input("Digite o valor da prova 2: "))
prova3 = float(input("Digite o valor da prova 3: "))

prova = prova * 2 /10
prova2 = prova2 * 3 /10
prova3 = prova3 * 5 /10
media = (prova + prova2 + prova3)

if (media >= 6):
    print(f"Aprovado com media: {media}")
elif (media >= 4):
    print(f"Em recuperacao com media: {media}")
else:
    print(f"Reprovado com media: {media}")