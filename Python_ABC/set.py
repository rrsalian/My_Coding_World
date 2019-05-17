s={1,2,3,3}
print(type(s))

a={}
print(type(a))

a=set()
print(type(a))

#print(s[3])

s={1,2,13,16,18,18,16,3}
s.add(24)
print(s)

s.add(18)
print(s)

b={1 ,2,3,41,5}

s.update((100,150,120,130,125))
print(s)



s={42,51,75,76}

s.discard(78)
print(s)

s.discard(42)
print(s)

s.remove(76)
print(s)

#5s.remove(42)
print(s)


s={1,3,4,5,6,7,8,9,11}

print(s.pop())

s.clear()

print(s)


A={1,2,3,4,5,6}
B={4,5,6,7,8,9,10}
print(A|B)
print(A.union(B))

