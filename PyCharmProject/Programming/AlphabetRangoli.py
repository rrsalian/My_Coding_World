n=int(input("Enter the Value"))

#l=[i for i in 'abcdefghijklmnopqrstuvwxyz']
temp1=''
for i in range(n):
    temp1+='-'+chr(97+i)
#temp2=temp1.replace('-a-','')
temp2=temp1[:2:-1]
s=temp2+temp1
if n==1:
    s='a'

p=s[0]
l_len=4
r_len=len(s)-1

l=[]
for i in range(1,n+1):
    l.append(p.center(len(s),'-'))
    print(p.center(len(s),'-'))
    p=s[0:l_len] + s[r_len:len(s)]
    l_len+=2
    r_len-=2

for i in l[-2::-1]:
    print(i)
    