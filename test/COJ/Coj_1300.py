cont = 0
a = range(10)

while cont < 10:
    a[cont] = int(raw_input())
    a[cont] = a[cont] % 42
    cont += 1

b = set(a)
print str(len(b))