n=input().lower()
s=list(filter(lambda x:x.isalpha(),n))

#print(s)
for i in range(len(s)-1):
    for j in range(i,len(s)):
        
        if s[i]>s[j]:
            #print(ord(s[i]),'=',s[i]," ",ord(s[j]),'=',s[j])
            t=s[i]
            s[i]=s[j]
            s[j]=t
            #print(s)
print(s)
