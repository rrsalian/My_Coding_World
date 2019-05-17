n=''
b=True
sum=0

def pizza_menu():
    sum=0
    l=[[1,'A',50,100,150],[2,'B',50,100,150],
       [3,'C',50,100,150],[4,'D',50,100,150],
       [5,'E',50,100,150]]
    print("Welcome ,")
    print("*".center(60,'*'))
    for i in l:
        print(i[0],'  ',i[1])
        print('Small  Medium  Large')
        print(i[2],'  ',i[3],'  ',i[4])
    print()
    print("*".center(60,'*'))
    print("Please enter your pizza")
    ch=input()
    if ch=='1':
        print("which size yout want?")
        print("press s for small ,m for medium ,l for large")
        si
        if(size=='s'):
            sum+=l[0][2]
    
    

while(b):
    name=input("Enter the Name")
    if name=='':
       print("Invalid name. Do you wnat to continue? Y/N: ")
       ch=input()
       if(ch!='Y'):
           print("Thanks for visiting")
           b=False
    else:
        b=False

print( "Welcome Mr.",name,"We are happy to serve you")
l=[[1,'Pizza'],[2,'Drinks'],[3,'Sides'][4,'Deserts'],[5,'Exit']]
print()
b=True
while b:
    print("Choose the category",end='\n\n')
    for i in l:
        print(i[0],' ',i[1])
    
    ch=input()
    if ch=='1':
        pass
    elif ch=='2':
        pass
    elif ch=='3':
        pass
    elif ch=='4':
        pass
    elif ch=='5':
        pass
    else:
        print("Invalid Choice, Do you want continue? Y/N" )
        a=input()
        if(a!='Y'):
            print("thanak you for visiting")
            b=False


