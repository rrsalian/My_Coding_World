l=[1,2,3]
a=[[]]

for i in l:
    s=len(a)
    for j in range(s):
        t=a[j].copy()
        t.append(i)
        a.append(t)
print(a)