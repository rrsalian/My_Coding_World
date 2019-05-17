foo=[2,18,9,22,17,24,8,12,27]
print(foo)
a=list(filter(lambda x:x%3==0,foo))
print(a)
a=list(filter(lambda x:x%2==0,foo))
print(a)
a=map(lambda x:x*2,a)
print(list(a))