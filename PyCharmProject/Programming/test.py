
n=int(input("Enter the no of Rectangle :"))

l=[]
for i in range(n):
    print("Enter the 4 cordinates of",str(i+1),"Rectangel :")
    l.append(list (map(lambda x:int(x),input().split())))

def area(l):
    a=(l[2]-l[0])*(l[3]-l[1])
    #print(a)
    return a

totalArea=0
for i in l:
    totalArea=totalArea+area(i)

intr=[]
def intersection(l1,l2):
    x=min(l1[2],l2[2])-max(l1[0],l2[0])
    y=min(l1[3],l2[3])-max(l1[1],l2[1])

    #print(x*y)
    if x>=0 and y>=0:
        intr.append(x*y)
        return x*y
    else:
        return  0


intersArea=0

for i in range(len(l)):
    for j in range(i+1,len(l)):
        intersArea+=intersection(l[i],l[j])

#print(totalArea,intersArea)

#print("Toal Are=",(totalArea-intersArea))

if len(intr)==n:
    a=min(intr)
    print("Toal Are=", (totalArea - intersArea+a))
else:
    print("Toal Are=", (totalArea - intersArea))

