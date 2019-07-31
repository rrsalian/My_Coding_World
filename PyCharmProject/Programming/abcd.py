n=int(input())


s=""

while n>0:
    if(n%26==0):
        s+="Z"
        n=(n//26)-1
    else:
        a=n%26
        s+=chr(64+a)
        n=(n//26)
print(s[::-1])