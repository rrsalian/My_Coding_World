def dec(n):
    i=0
    while i<n:
        yield 2**i
        i+=1

for i in dec(15):
    print(i)