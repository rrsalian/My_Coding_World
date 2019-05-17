n=input("Enter the String: ").lower()
t=""
temp=""
count=0
for i in n:
    if i>='a' and i<='z':
        count+=1
        t+=i
    else:
        temp+=t[0].upper()+t[1::]+ str(count)+' '
        t=''
        count=0
temp+=t[0].upper()+t[1::]+str(count)
print(temp)