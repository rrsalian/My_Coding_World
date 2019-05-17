n=''
b=True
sum=0
##################################### Fizza Menu #################################
def pizza_menu():
    sum=0
    l=[[1,'Veg Extravaganza',50,100,150],[2,'Deluxe Veggie',50,100,150],
       [3,'Peppy Panner',50,100,150],[4,'Indi Tandoori Paneer',50,100,150],
       [5,'Chicken Pepperoni',50,100,150],[6,'Non Veg Supreme',50,100,150],
       [7,'Chicken Golden Delight',50,100,150]]
    print("Welcome ,Select out today's special pizza's and enjoy",end='\n\n')
    b=True
    while b:
        print('*'.center(30,'*'))
        for i in l:
            print(i[0],'.    ',i[1])
            print('       Small Medium Large     ')
            print('       ',i[2],'  ',i[3],'  ',i[4])
            print('_'.center(30,'_'))
            
        print()
        
        choice=input("Please choose the pizza you want: ")
        if choice=='1':
            print("Which size you want ")
            size=input('''Enter 's' for small and press 'm' for medium 
                       and press 'l' for large: ''')
            if(size=='s'):
                sum+=l[0][2]
            elif(size=='m'):
                sum+=l[0][3]
            elif(size=='l'):
                sum+=l[0][4]
            else:
                print("Invalid choice. Do you wish to continue? Y/N")
                a=input()
                if a!='Y':
                    print("Thanks for visiting us")
                    b=False
        elif choice=='2':
            print("Which size you want ")
            size=input('''Enter 's' for small and press 'm' for medium 
                       and press 'l' for large''')
            if(size=='s'):
                sum+=l[1][2]
            elif(size=='m'):
                sum+=l[1][3]
            elif(size=='l'):
                sum+=l[1][4]
            else:
                print("Invalid choice. Do you wish to continue? Y/N")
                a=input()
                if a!='Y':
                    print("Thanks for visiting us")
                    b=False
        elif choice=='3':
            print("Which size you want ")
            size=input('''fEnter 's' for small and press 'm' for medium 
                       and press 'l' for large''')
            if(size=='s'):
                sum+=l[2][2]
            elif(size=='m'):
                sum+=l[2][3]
            elif(size=='l'):
                sum+=l[2][4]
            else:
                print("Invalid choice. Do you wish to continue? Y/N")
                a=input()
                if a!='Y':
                    print("Thanks for visiting us")
                    b=False
        elif choice=='4':
            print("Which size you want ")
            size=input('''Enter 's' for small and press 'm' for medium 
                       and press 'l' for large''')
            if(size=='s'):
                sum+=l[3][2]
            elif(size=='m'):
                sum+=l[3][3]
            elif(size=='l'):
                sum+=l[3][4]
            else:
                print("Invalid choice. Do you wish to continue? Y/N")
                a=input()
                if a!='Y':
                    print("Thanks for visiting us")
                    b=False
        elif choice=='5':
            print("Which size you want ")
            size=input('''Enter 's' for small and press 'm' for medium 
                       and press 'l' for large''')
            if(size=='s'):
                sum+=l[4][2]
            elif(size=='m'):
                sum+=l[4][3]
            elif(size=='l'):
                sum+=l[4][4]
            else:
                print("Invalid choice. Do you wish to continue? Y/N")
                a=input()
                if a!='Y':
                    print("Thanks for visiting us")
                    b=False
        elif choice=='6':
            print("Which size you want ")
            size=input('''Enter 's' for small and press 'm' for medium 
                       and press 'l' for large''')
            if(size=='s'):
                sum+=l[5][2]
            elif(size=='m'):
                sum+=l[5][3]
            elif(size=='l'):
                sum+=l[5][4]
            else:
                print("Invalid choice. Do you wish to continue? Y/N")
                a=input()
                if a!='Y':
                    print("Thanks for visiting us")
                    b=False
        elif choice=='7':
            print("Which size you want ")
            size=input('''Enter 's' for small and press 'm' for medium 
                       and press 'l' for large''')
            if(size=='s'):
                sum+=l[6][2]
            elif(size=='m'):
                sum+=l[6][3]
            elif(size=='l'):
                sum+=l[6][4]
            else:
                print("Invalid choice. Do you wish to continue? Y/N")
                a=input()
                if a!='Y':
                    print("Thanks for visiting us")
                    b=False
        else:
            print("Invalid choice. Do you wish to continue? Y/N")
            a=input()
            if a!='Y':
                print("Thanks for visiting us")
                b=False
    
    
while b:
    name=input("Enter your name: ")
    if len(name)==0:
        a=input("Invalid name.Do you want continut? Y?N")
        if a!='Y':
            b=False
            print("thank You")
            raise SystemExit
    else:
        b=False
print()
print()
c="welcome to Dominos "
print(c.center(60,'*'))
print("Welcome Mr.",name,"We are happy to serve you.")
print()
cat=[[1,'pizza'],[2,'drinks'],[3,'sides'],[4,'Deserts'],[5,'exit']]

b=True
while b:
    print("Choose category",end='\n\n')
    for i in cat:
        print(i[0],'.',i[1])
    choice=input()
    if choice=='1':
        pizza_menu()
    elif choice=='2':
        pass
    elif choice=='3':
        pass
    elif choice=='4':
        pass
    elif choice=='5':
        pass
    else:
        print("Invalid choice. Do you wish to continue? Y/N")
        a=input()
        if a!='Y':
            print("Thanks for visiting us")
            b=False
        

