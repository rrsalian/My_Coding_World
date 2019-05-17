N=int(input("Enter a value"))

l=[i for i in 'abcdefghijklmnopqustuvwxyz']
temp1=''
for i in range(N):
    temp1 += '-'
    temp1+=l[i]
temp2=temp1.replace("-a-",'')
temp2=temp2[::-1]

#Mid line of Rangloi
mid=temp2+temp1

f=mid[0]
f_length=4;
s_length=len(mid)-1

#Upper Part of Rangoli
lst=[]
for i in range(1,N):
    print(f.center(len(mid),'-'))
    lst.append(f.center(len(mid),'-'))
    f=mid[0:f_length]+mid[s_length:len(mid)]
    f_length+=2
    s_length-=2

#Mid Line Of Rangoli
print(mid)

#Lower Part of Rangoli
for i in range(len(lst)):
    print(lst[len(lst)-i-1])