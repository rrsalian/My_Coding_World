n=''
b=True
while b:
    n=input("Enter your name: ")
    if len(n)==0:
        a=input("Invalid name.Do you want continut? Y?N")
        if a!='Y':
            b=False
            print("thank You")
    else:
        b=False
print()
print()
c="welcome to Dominos "   
print(c.center(60,'*'))
print("Welcome Mr.",n,"we are happy to serve you")

def category():
    print("Choose Category:")
    print("1. Pizza")
    print("2. IceCream")
    print("3. Drinks")
    print("4. Snacks")
    print()
    ch=int(input())
    if(ch
        

