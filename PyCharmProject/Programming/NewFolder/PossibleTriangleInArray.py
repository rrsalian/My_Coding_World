def subset(l):
    set=[[]]
    for i in l:
        size=len(set)
        for j in range(size):
            temp=set[j].copy()
            temp.append(i)
            set.append(temp)
    return set

l=[10, 21, 22, 100, 101, 200, 300]
sub=subset(l)
#print(sub)
count=0
for i in sub:
    if len(i)==3:
        if(i[0]+i[1]>i[2] and i[1]+i[2]>i[0] and i[0]+i[2]>i[1]):
            #print(i)
            count+=1
print(count)
