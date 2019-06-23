n=int(input("Enter :"))

s=""

num=n

while (num>0):
    if(num%26==0):
        s+='Z'
        num=(num//26)-1
    else:
        s+=chr(64+num%26)
        num//=26
        
        
print(s[::-1])