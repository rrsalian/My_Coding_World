#a1=int(input())
#a2=int(input())
#a3=int(input())
#a4=int(input())

#b1=int(input())
#b2=int(input())
#b3=int(input())
#b4=int(input())

if set(range(1,6+1)) & set(range(5,10+1)):
    if set(range(1,6+1)) & set(range(5,10+1)):
        l1=list(set(range(1,6+1)) & set(range(5,10+1)))
        l2=list(set(range(1,6+1)) & set(range(5,10+1)))
        print(l1)
        print(l2)
        if len(l1)>1 and len(l2)>1:
            area=(l1[0]-l1[-1])*(l2[0]-l2[-1])
            print(area)
    else:
        print('false')
else:
    print("false")
    

