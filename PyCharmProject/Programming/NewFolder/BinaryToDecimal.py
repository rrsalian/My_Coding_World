n=int(input("Enter Binary Number: "))

num=n
res=0
k=0
while num>0:
    r=num%10
    res+=r*2**k
    k+=1
    num//=10
print(res)
