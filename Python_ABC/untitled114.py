l=[0,1,2,3]

a=[[]]

for i in l:
    for j in range(len(a)):
        t=a[j].copy()
        t.append(i)
        a.append(t)
print(a)
