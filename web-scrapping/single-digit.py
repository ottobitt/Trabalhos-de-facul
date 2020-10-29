n = '9875987598759875'
soma = 10

while soma >= 10:
    soma = 0
    for num in n:
        soma += int(num)
    n = str(soma)

print(n)