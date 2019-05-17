s=input("Enter the string: ")
s=sorted(s)
t=''
for i in range(len(s)-1):
    if s[i]!=s[i+1]:
        t+=s[i]
t+=s[-1]
print(t)