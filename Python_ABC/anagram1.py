n=input()
m=input()
k=""
l=""
for i in n:
   if(i.isalpha()):
       k+=i
for j in m:
    if(j.isalpha()):
        l+=j
k=k.lower()
l=l.lower()

k=list(k)
l=list(l)
k.sort()
l.sort()
if(len(k)==len(l)):
    i=0;
    while(l[i]==k[i]):
        i+=1
        if(i==len(k)):
            break
    if(i==len(k)):
        print("anagram")
    else:
        print("not anagram")
else:
    print("not anagram")
    
        