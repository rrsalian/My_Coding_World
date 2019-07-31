n=int(input("Ente the number"))

f=True
for i in range(2,n//2):
    if n%i==0:
        print(n,"is not a prime number")
        f=False
        break

if(f==True):
    print(n," is Prime numer")
