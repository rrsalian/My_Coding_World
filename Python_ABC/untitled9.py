s=input()
m=''
for i in s:
    if (i>='A' and i<='Z') or (i>='a' and i<='z') or i==' ':
        m+=i
print(m)