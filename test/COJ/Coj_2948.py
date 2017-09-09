t = int(raw_input())
while t > 0:
    a = int(raw_input())
    while a >= 10:
        suma = 0
        while a != 0:
            b = a % 10
            a = a / 10
            suma = suma + b

        a = suma
    print a
    t= t -1

