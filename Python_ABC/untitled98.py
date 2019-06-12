n=input("Enter the String :")
s=""
i=0
while i<len(n):
    if i==0:
        s+=n[i].upper()
    elif n[i]!=' ' and n[i-1]==' ':
        s+=n[i].upper()
    elif n[i].islower():
        s+=n[i]
    elif n[i].isupper:
        s+=n[i].lower()
    else:
        s+=n[i]
    i+=1
print(s)
    