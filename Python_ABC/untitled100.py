s=input("Enter the String: ").lower()
l=[]
t=""
i=0
while i<len(s):
    if s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u' and i==0:
        t+=s[i]+s[i+1]
        l.append(t)
    elif s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u' and i==len(s)-1:
        t+=s[i]+s[i+1]
        l.append(t)
    elif s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u':
        t+=s[i-1]+s[i]+s[i+1]
        l.append(t)
    i+=1
    t=""
print(l)


    
    