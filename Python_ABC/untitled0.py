l=[1]
print(l*2)
t=(2,3)
print(t*2)

t1=tuple({1})
print(type(t1))
print(t1*2)

s=set()
print(type(s))

s="this is python"
# =============================================================================
# a=s.capitalize()
# print(a)
# =============================================================================
a=s.casefold()
b=s.lower()
print(a==b)


s="asdf\tdf\tasdf"
print()
print(s)
print(s.expandtabs(8))
print()
print(s.expandtabs(0))
print(s.expandtabs(1))
print(s.expandtabs(2))
print(s.expandtabs(3))
print(s.expandtabs(4))
print(s.expandtabs(5))
print(s.expandtabs(6))
print(s.expandtabs(7))
print(s.expandtabs(8))
print(s.expandtabs(9))
print(s.expandtabs(10))
print(s.expandtabs(11))
print(s.expandtabs(12))
print(s.expandtabs(13))
print(s.expandtabs(14))
print(s.expandtabs(15))
print(s.expandtabs(16))
