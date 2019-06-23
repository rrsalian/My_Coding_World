n=int(input("Enter :"))

s=""
l=[]
i=0
k=1
def find(k):
    global i
    k+=1
    
    if k<=n:
        if(k%26==0):
            l.append(find(k))
    else:
        return k
    
print(l)
        