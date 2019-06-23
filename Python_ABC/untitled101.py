s=input("Enter the String")
k=int(input("Enter the Key"))
t=""

if k>=26:
    k=k-26

for i in s:
    if i.isalpha():
        if i.isupper():
            if ord(i)>=65 and ord(i)<=90-k:
                t+=chr(ord(i)+k)
                
            else:
                t+=chr(ord(i)+k-26)
                
        elif i.islower():
            if ord(i)>=97 and ord(i)<=122-k:
                t+=chr(ord(i)+k)
                
            else:
                t+=chr(ord(i)+k-26)
                
    elif i.isdecimal():
        if ord(i)>=48 and ord(i)<=57-k:
            t+=chr(ord(i)+k)
        else:
            t+=chr(ord(i)+k-10)
    else:
        t+=i
print(t)