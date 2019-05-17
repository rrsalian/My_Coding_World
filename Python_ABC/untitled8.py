n=input()
m=""
for i in n:
    if i>='a' and i<='z':
        m+=i.upper()
    elif i>='A' and i<='Z':
        m+=i.lower()
    else:
        m+=i
print(m)
        
        