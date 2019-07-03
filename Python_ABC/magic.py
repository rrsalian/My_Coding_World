n=int(input())
l=[]
for i in range(n):
    l.append(int(input()))

ll=sorted(l)
a=b=0
for i in range(len(l)):
    if(l[i]==ll[i]):
        a+=l[i]
    else:
        b+=l[i]
print(a-b)