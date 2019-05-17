l=list(range(1,200))
l1=list(map(lambda x:x*11,list(filter(lambda x:x%3==0 and x%5==0,l))))
print(l1)

################################
# Both the code code are same

print(list(map(lambda x:x*11,list(filter(lambda x:x%3==0 and x%5==0,list(range(1,200)))))))