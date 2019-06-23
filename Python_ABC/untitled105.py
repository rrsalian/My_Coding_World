s="aaabbccc"
ss=""
count=0
for i in range(len(s)-1):
    if(s[i]==s[i+1]):
        count+=1
    else:
        count+=1
        ss+=str(count)+s[i]
        count=0
ss+=str(count+1)+s[-1]
print (ss)