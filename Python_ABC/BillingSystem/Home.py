n=''
bill=[]
##################################### Cart ####################################
def cart(a,b,c):
    for i in bill:
        if i[0]==a:
            i[2]=i[2]+c
            break
    else:
        bill.append([a,b,c])
##################################### Exit ####################################
def exitDom():
    print("Do you want to exit?")
    ex=input("Y/N ?")
    if(ex=='Y'):
        print('\n'*20)
        c=" Domino's Bill "
        print(c.center(70,'#'))
        print("Name:",n)
        if(len(bill)>0):
            total=0
            tqty=0
            k=1;
            print("SI.No".ljust(7,' '),'Item'.ljust(25,' '),'No.Item','   Price','   Total' )
            print('-----------------------------------------------------------------------')
            for i in bill:
                print(k,'     ',i[0].ljust(30,' '),i[2],'    ',i[1],'    ',i[1]*i[2])
                total+=i[1]*i[2]
                tqty+=i[2]
                k+=1
            cgst=total*(9/100)
            sgst=total*(9/100)
            print("-----------------------------------------------------------------------")
            print('Total Qty                             ',tqty)
            print('Sub Total                                            ',total)
            print("-----------------------------------------------------------------------")
            print("CGST @9% :                                           ",round(cgst,2))
            print("SGST @9% :                                           ",round(sgst,2))
            print("Total GST:                                           ",round((cgst+sgst),2))
            print("-----------------------------------------------------------------------")
            print("Grand Total                                          ",round((total+sgst+cgst),2),"Rs")
            print("-----------------------------------------------------------------------")
            print("                     Thank You fo Visiting")
            print("                     Review us on Google and Facebook")
            print("                     Have a Nice Day")
            print()
            print("-----------------------------------------------------------------------")
            print()
            print()
        else:
            print("-----------------------------------------------------------------------")
            print("                     Items are not selected")
            print("                     Thank You fo Visiting")
            print("                     Review us on Google and Facebook")
            print("                     Have a Nice Day")
            print("-----------------------------------------------------------------------")
    else:
        category()
################################ View Cart ####################################
def viewcart():
    print('\n'*5)
    c=" Domino's Cart "
    print(c.center(60,'#'))
    print()
    if(len(bill)>0):
        total=0
        tqty=0
        k=1;
        print("SI.No".ljust(7,' '),'Item'.ljust(25,' '),'No.Item','   Price','   Total' )
        print('-----------------------------------------------------------------------')
        for i in bill:
            print(k,'     ',i[0].ljust(30,' '),i[2],'    ',i[1],'    ',i[1]*i[2])
            total+=i[1]*i[2]
            tqty+=i[2]
            k+=1
        print("-----------------------------------------------------------------------")
        print('Total Qty                             ',tqty)
        print('Sub Total                                            ',total,"Rs")
        print("-----------------------------------------------------------------------")
        print()
        print()
        print()
        print('1. Manin Menu')
        print('2. Exit')
        print('3. Remove item from cart')
        ch=(input("Enter your choice: "))
        if (ch.isdecimal()):
            if (int(ch)==1):
                category()
            elif (int(ch)==2):
                exitDom()
            elif(int(ch)==3):
                print()
                n=input("Enter the SI.No of item to be removed: ")
                if(n.isdecimal() and int(n)<=(len(bill))):
                    print(bill[int(n)][0],'- is removed from cart')
                    bill.pop(int(n))
                    viewcart()
                else:
                    print("Invalid SI.No")
                    viewcart()
        else:
                    viewcart()
        print()
    else:
        print("****** 0 Item in the cart  ******")
        print()
        category()
        print()
############################# Sides & Other Store #############################
def sides():
    print('\n'*5)
    c=" Sides & Others "
    print(c.center(70,'#'))
    print()
    k=1;
    sidesmenu=[['White Pasta Itaiiano Non-Veg',145],['Burger Pizza-Classic Non Veg',139],
               ['Stuffed Garlic Breadsticks',139], ['Taco Mexicana Non Veg',135],
               [ 'White Pasta Italiano Veg',135], ['Burger Pizza-Premium Veg',129],
               ['Taco Mexicana Veg',125]]
    print("-----------------------------------------------------------------------")
    for i in sidesmenu:
        print(k,i[0].ljust(30,' '),"  Rs.",i[1])
        k+=1
    print("-----------------------------------------------------------------------")
    print()
    print(k,"Main Menu")
    k+=1
    print(k,"View Cart")
    k+=1
    print(k,"Exit")
    ch=(input("Enter your choice: "))
    if(ch.isdecimal()):
        if int(ch)>=1 and int(ch)<=7:
            qty=(input("Enter the Quantity: "))
            if(qty.isdecimal()):
                print("Do you want to add '",qty,"' no item?" )
                dec=input("Y/N ?: ")
                if(dec=='Y'):
                    print()
                    print(sidesmenu[int(ch)-1][0]," : successfully added to cart")
                    print()
                    cart(sidesmenu[int(ch)-1][0],sidesmenu[int(ch)-1][1],int(qty))
                    sides()
                else:
                    print("Invalid Choice")
                    sides()
            else:
                print("Invalid Quantity")
                sides()
        
        elif int(ch)==8:
            category()
        elif int(ch)==9:
            viewcart()
        elif int(ch)==10:
            exitDom()
        else:
            print()
            print("Enter a valid choice")
            sides()
    else:
            print()
            print("Enter a valid choice")
            sides()
############################# Beverages Store #################################
def beverages():
    print('\n'*5)
    c=" Beverages "
    print(c.center(70,'#'))
    print()
    k=1;
    beveragesmenu=[['Mirinda',60],['7 Up',60],['Pepsi',60], ['Lipton Ice Tea',50],
                   [ 'Bailley Water(500ml)',20],['Cold Coffee',45],['Oreo Milkshake',149]]
    print("-----------------------------------------------------------------------")
    for i in beveragesmenu:
        print(k,i[0].ljust(30,' '),"  Rs.",i[1])
        k+=1
    print("-----------------------------------------------------------------------")
    print()
    print(k,"Main Menu")
    k+=1
    print(k,"View Cart")
    k+=1
    print(k,"Exit")
    ch=(input("Enter your choice: "))
    if (ch.isdecimal()):
        if int(ch)>=1 and int(ch)<=7:
            qty=(input("Enter the Quantity: "))
            if(qty.isdecimal()):
                print("Do you want to add '",qty,"' no item?" )
                dec=input("Y/N ?: ")
                if(dec=='Y'):
                    print()
                    print(beveragesmenu[int(ch)-1][0]," : successfully added to cart")
                    print()
                    cart(beveragesmenu[int(ch)-1][0],beveragesmenu[int(ch)-1][1],int(qty))
                    beverages()
                else:
                    print("Invalid Choice")
                    beverages()
            else:
                print("Invalid Quantity")
                beverages()
        elif int(ch)==8:
            category()
        elif int(ch)==9:
            viewcart()
        elif int(ch)==10:
            exitDom()
        else:
            print()
            print("Enter a valid choice")
            beverages()
    else:
            print()
            print("Enter a valid choice")
            beverages()
############################# Desserts Store ##################################
def desserts():
    print('\n'*5)
    c=" Desserts "
    print(c.center(70,'#'))
    print()
    k=1;
    dessertsmenu=[['Choco Lava Cake',99],['Butterscotch Mousse Cake',90],
                  ['Anjeer Ice Cream',75],['Tender Coconut IceCream',65],
                  [ 'Black Current IceCram',65],['Fruit Falooda',95],
                  ['Mango Falooda',80]]
    print("-----------------------------------------------------------------------")
    for i in dessertsmenu:
        print(k,i[0].ljust(30,' '),"  Rs.",i[1])
        k+=1
    print("-----------------------------------------------------------------------")
    print()
    print(k,"Main Menu")
    k+=1
    print(k,"View Cart")
    k+=1
    print(k,"Exit")
    ch=(input("Enter your choice: "))

    if (ch.isdecimal()):
        if int(ch)>=1 and int(ch)<=7:
            qty=(input("Enter the Quantity: "))
            if(qty.isdecimal()):
                print("Do you want to add '",qty,"' no item?" )
                dec=input("Y/N ?: ")
                if(dec=='Y'):
                    print()
                    print(dessertsmenu[int(ch)-1][0]," : successfully added to cart")
                    print()
                    cart(dessertsmenu[int(ch)-1][0],dessertsmenu[int(ch)-1][1],int(qty))
                    desserts()
                else:
                    print("Invalid Choice")
                    desserts()
            else:
                print("Invalid Quantity")
                desserts()
        elif int(ch)==8:
            category()
        elif int(ch)==9:
            viewcart()
        elif int(ch)==10:
            exitDom()
        else:
            print()
            print("Enter a valid choice")
            desserts()
    else:
            print()
            print("Enter a valid choice")
            desserts()
############################# Non-Veg Pizza Store #############################
def NonVegPizza():
    print('\n'*5)
    c=" Non-Veg Pizza "
    print(c.center(70,'#'))
    print()
    k=1;
    nonvegpizzamenu=[['Chicken Pepperoni',555],['Non Veg Supreme',555],
                     ['Chicken Golden Delight',450],['Indi Chicken Tikka',555],
                     [ 'Jamaican Jerk Chicken',555], ['Aussie Barbecue Chicken',555],
                     ['Chicken Dominator',555]]
    print("-----------------------------------------------------------------------")
    for i in nonvegpizzamenu:
        print(k,i[0].ljust(30,' '),"  Rs.",i[1])
        k+=1
    print("-----------------------------------------------------------------------")
    print()
    print(k,"Main Menu")
    k+=1
    print(k,"View Cart")
    k+=1
    print(k,"Exit")
    ch=(input("Enter your choice: "))
    
    if(ch.isdecimal()):
        if int(ch)>=1 and int(ch)<=7:
            qty=(input("Enter the Quantity: "))
            if(qty.isdecimal()):
                print("Do you want to add '",qty,"' no item?" )
                dec=input("Y/N ?: ")
                if(dec=='Y'):
                    print()
                    print(nonvegpizzamenu[int(ch)-1][0]," : successfully added to cart")
                    print()
                    cart(nonvegpizzamenu[int(ch)-1][0],nonvegpizzamenu[int(ch)-1][1],int(qty))
                    NonVegPizza()
                else:
                    print("Invalid Choice")
                    NonVegPizza()
            else:
                print("Invalid Quantity")
                NonVegPizza()
        elif int(ch)==8:
            category()
        elif int(ch)==9:
            viewcart()
        elif int(ch)==10:
            exitDom()
        else:
            print()
            print("Enter a valid choice")
            NonVegPizza()
    else:
            print()
            print("Enter a valid choice")
            NonVegPizza()
############################# Veg Pizza Store #################################
def vegPizza():
    print('\n'*5)
    c=" Veg Pizza "
    print(c.center(70,'#'))
    print()
    k=1;
    vegpizzamenu=[['Veg Extravaganza',450],['Deluxe Veggie',450] ,['Peppy Panner',385],
                  ['Indi Tandoori Paneer',450],[ 'Aussie Barbecue VEg',385],
                  ['English Cheddar And Veggies',305],['Jamaican Jerk Veg',195]]
    print("-----------------------------------------------------------------------")
    for i in vegpizzamenu:
        print(k,i[0].ljust(30,' '),"  Rs.",i[1])
        k+=1
    print("-----------------------------------------------------------------------")
    print()
    print(k,"Main Menu")
    k+=1
    print(k,"View Cart")
    k+=1
    print(k,"Exit")
    ch=(input("Enter your choice: "))
    if(ch.isdecimal()):
        if int(ch)>=1 and int(ch)<=7:
            qty=(input("Enter the Quantity: "))
            if(qty.isdecimal()):
                print("Do you want to add '",qty,"' no item?" )
                dec=input("Y/N ?: ")
                if(dec=='Y'):
                    print()
                    print(vegpizzamenu[int(ch)-1][0]," : successfully added to cart")
                    print()
                    cart(vegpizzamenu[int(ch)-1][0],vegpizzamenu[int(ch)-1][1],int(qty))
                    vegPizza()
                else:
                    print("Invalid Choice")
                    vegPizza()
            else:
                print("Invalid Quantity")
                vegPizza()
        elif int(ch)==8:
            category()
        elif int(ch)==9:
            viewcart()
        elif int(ch)==10:
            exitDom()
        else:
            print()
            print("Enter a valid choice")
            vegPizza()
    else:
            print()
            print("Enter a valid choice")
            vegPizza()
################################## Home #######################################
def category():
    #while(1):
        c=" Main Category "
        print(c.center(70,'#'))
        print()
        print()
        print('**********************************"')
        print("Choose Category:")
        print()
        print("1. Veg Pizza")
        print("2. Non-Veg Pizza")
        print("3. Desserts")
        print("4. Beverages")
        print("5. Sides & Others")
        print()
        print()
        print("6. View Cart")
        print("7. Exit")
        print()
        print('***********************************"')
        ch=(input("Enter your choice: "))
        print()
        if(ch.isdecimal()):
            if(int(ch)==1):
               vegPizza()
            elif(int(ch)==2):
                NonVegPizza()
            elif(int(ch)==3):
                desserts()
            elif(int(ch)==4):
                beverages()
            elif(int(ch)==5):
                sides()
            elif(int(ch)==6):
                viewcart()
            elif(int(ch)==7):
                exitDom()
            else:
                print("Enter a valid Choice")
                category()
        else:
                print("Enter a valid Choice")
                category()
################################### Login #####################################
n=''
b=True
print('='.center(80,'='))
while b:
    n=input("Enter your name: ")
    if len(n)==0 or n.isdecimal():
        a=input("Invalid name.Do you want continut? Y?N")
        if a!='Y' :
            b=False
            print("Thank You For Visiting")
    else:
        b=False
        print()
        print()
        c=" Welcome to Dominos "
        print(c.center(70,'*'))
        print()
        print("Welcome Mr.",n,". We are Happy to serve you.")
        print()
        bill=[]
        category()