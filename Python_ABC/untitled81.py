

l=[]
n=5
for i in range(1,n+1):
    k=[]
    for j in range(i,i*i+1,i):
      k.append(j)  
    l.append(k)

print(l)