
def solution(c,x,y,q):
    res=[]
    for i in q:
        k=c.index(i)
        l=[]
        for i in range(len(city)):
            if i==k:
                continue
            elif x[k]==x[i] or y[k]==y[i]:
                a=abs(x[k]-x[i])
                b=abs(y[k]-y[i])
                d=a+b
                l.append([city[i],d])
        if len(l)==0:
            res.append("None")
        else:
            l.sort(key=lambda x:x[-1])
            res.append(l[0][0])
    return res







n=int(input())
city=[]

for i in range(n):
    city.append((input()))

x=[]
n=int(input())
for i in range(n):
    x.append(int(input()))

y=[]
n=int(input())
for i in range(n):
    y.append(int(input()))

q=[]
n=int(input())
for i in range(n):
    q.append((input()))

print(solution(city,x,y,q))

