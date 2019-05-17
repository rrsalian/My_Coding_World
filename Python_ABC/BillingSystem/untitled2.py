bill=[]
def cart(a,b,c):
    for i in bill:
        if i[0]==a:
            i[2]=i[2]+c
            break
    else:
        bill.append([a,b,c])
    print(bill)
            
cart('abcd',50,5)
cart('abcd',50,5)


