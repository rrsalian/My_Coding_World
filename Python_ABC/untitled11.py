s=input()
t=''
n=0
for i in s:
    if (i>='A' and i<='Z') or (i>='a' and i<='z') :
        t+=i
    elif (i>='1' and i<='9'):
        n+=int(i)
    elif i==' ':
        t+=str(n)+' '
        n=0
t+=str(n)
print(t)