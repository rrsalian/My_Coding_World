n=int(input())
def find(n):
    a=1
    b=1
    if n<=1:
        return 1
    for i in range(n-1):
        c=a+b
        a,b=b,c
    else:
        return c
    
print(find(n))

