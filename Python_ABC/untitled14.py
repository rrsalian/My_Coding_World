n=input().lower()

def sort1(l):
    #print(l)
    for i in range(len(l)):
        for j in range(i,len(l)):
            if l[i]>l[j]:
                print(l)
                print(ord(l[i]),'=',l[i]," ",ord(l[j]),'=',l[j])
                t=l[i]
                l[i]=l[j]
                l[j]=t
                print(l)
                print()
    return l
s=list(filter(lambda x:x.isalpha(),n))
print(''.join(sort1(s)))