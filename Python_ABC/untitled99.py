s=input("Enter the String: ").lower()
l=[]
for i in range(len(s)):
    c=s[i]
    if c=='a' or c=='e' or c=='i' or c=='o' or c=='u':
        if i==0:
            l.append(s[i:i+2])
        elif i==len(s)-1:
            l.append(s[-2:])
        else:
            l.append(s[i-1:i+2])

print(l)