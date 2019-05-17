def subset(l):
    set=[[]]
    for i in l:
        size=len(set)
        for j in range(size):
            temp=set[j].copy()
            temp.append(i)
            set.append(temp)
    return set

l=[1,2,3]
sub=subset(l)
print(sub)
