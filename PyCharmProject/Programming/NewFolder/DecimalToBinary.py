n=int(input("Enter the Decimal number: "))

num=n
s=""
while num>0:
    r=num%2
    s+=str(r)
    num//=2
s=s[::-1]
print(s)