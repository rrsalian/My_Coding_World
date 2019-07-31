n=int(input("Enter a number :"))

num=n
s=""
while num>0:
    r=num%10
    s+=str(r)
    num=num//10

print(s)
