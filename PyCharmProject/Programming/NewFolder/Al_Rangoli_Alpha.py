
n=7
for i in range(n):
    for j in range(i+i-2,(n-2)*2):
        print("-",end='')


    for k in range(i+1):
        print(chr(96+n-k),end="")
        print("-",end='')

    for l in range(i):
        print(chr(97+n+l-i),end='')
        if l!=i-1:
            print('-',end='')

    for m in range(i + i - 2, (n - 2) * 2):
        print("-", end='')


    print()
