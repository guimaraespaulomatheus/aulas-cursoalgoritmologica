saldo = float(input("Informe seu saldo: "))
cheque = float(input("Informe o valor do cheque: "))
if (cheque <= saldo):
    saldo = saldo - cheque
    print(f"O saldo atualizado ficou de: {saldo}")
else:
    print(f"\n Atencao saldo insuficiente para realizar transacao: ")
    print(f"\n Transacao recusada devido a baixo limite: {saldo}")