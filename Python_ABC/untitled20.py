#l=[i for i in range(1,501)]
#l=list(filter(lambda x:x%3==0,l))
#l=list(map(lambda x:x**5,l))
#l=list(filter(lambda x:x%5==0,l))
#l=list(map(lambda x:x//10,l))
#print(l)

print(list(map(lambda x:x//10,list(filter(lambda x:x%5==0,list(map(lambda x:x**5,list(filter(lambda x:x%3==0,[i for i in range(1,501)])))))))))