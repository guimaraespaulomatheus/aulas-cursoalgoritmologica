n1 = int(input("Informe o valor de n1: "))
n2 = int(input("Informe o valor de n2: "))
n3 = int(input("Informe o valor de n3: "))


if ((n1 >= n2) & (n1 >= n3)):
    print(f"\n O valor de n1 é maior. {n1}")

if (n2 <= n3):
    print(f"\n O valor de n2 é menor. {n2}")
else:
    print(f"\n O valor de n3 é menor. {n3}")
    
if ((n2 >= n1) & (n2 >= n3)):
    print(f"\n O valor de n2 é maior. {n2}")
    
if (n1 <= n3):
    print(f"\n O valor de n1 é menor. {n1}")
else:
    print(f"\n O valor de n3 é menor. {n3}")
    
if ((n3 >= n2) & (n3 >= n1)):
    print(f"\n O valor de n3 é maior. {n3}")
    
if (n2 <= n1):
    print(f"\n O valor de n2 é menor. {n2}")
else:
    print(f"\n O valor de n1 é menor. {n1}")