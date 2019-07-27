n=int(input())

num=n
s=""
while num>0:
    if num%26==0:
        s+="z"
        num=(num//26)-1
    else:
        k=num%26
        c=chr(64+k)
        s+=c
        num//=26

print(s)