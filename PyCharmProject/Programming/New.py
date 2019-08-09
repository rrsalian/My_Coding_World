team1=input()
team2=input()

l1=[]
n1=int(input())
for i in range(n1):
    l1.append( input().split())


for i in l1:
    i.insert(0,team1)
    if i[-2].isalpha():
        if "+" in i[-3]:
            k=list(map(lambda x: int(x), i[-2].split("+")))
            i.insert(-1,k)
        else:
            k=[]
            k.append((int(i[-3])))
            k.append(0)
            i.insert(-1,k)

    else:
        if "+" in i[-2]:
            k=list(map(lambda x: int(x), i[-2].split("+")))
            i.insert(-1,k)
        else:
            k=[]
            k.append((int(i[-2])))
            k.append(0)
            i.insert(-1,k)


l2=[]
n2=int(input())
for i in range(n2):
    l2.append(input().split())


for i in l2:
    i.insert(0,team2)
    if i[-2].isalpha():
        if "+" in i[-3]:
            k=list(map(lambda x: int(x), i[-2].split("+")))
            i.insert(-1,k)
        else:
            k=[]
            k.append((int(i[-3])))
            k.append(0)
            i.insert(-1,k)

    else:
        if "+" in i[-2]:
            k=list(map(lambda x: int(x), i[-2].split("+")))
            i.insert(-1,k)
        else:
            k=[]
            k.append((int(i[-2])))
            k.append(0)
            i.insert(-1,k)

l1.sort(key=lambda x:x[-2][0])
l2.sort(key=lambda x:x[-2][0])

res=l1+l2
res.sort(key=lambda x:x[-2][0])

for i in res:
    i.pop(-2)
    print(" ".join(i))
