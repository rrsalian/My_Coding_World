n=input("enter the String").lower()
def sort1(l):
    for i in range(len(l)):
        for j in range(i,len(l)):
            if l[i]>l[j]:
                t=l[i]
                l[i]=l[j]
                l[j]=t
    return l
s=list(filter(lambda x:x.isalpha(),n))
print(''.join(sort1(s)))