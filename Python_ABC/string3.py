n=input("Enter the String: ")
temp=""
t=""
sum=0
for i in n:
    if i>='a' and i<='z':
        if i=='a' or i=='e' or i=='i' or i=='o' or i=='u':
            t+="*"+i
        else:
            t+=i
    elif i>='0' and i<='9':
        sum+=int(i)
    elif i==" ":
        temp+=t+str(sum)+" "
        t=''
        sum=0
temp+=t+str(sum)
print(temp)
