s=input().upper()

n=0

k=len(s)-1
for i in s:
    n+=(ord(i)-64)*(26**k)
    k-=1

print(n)


# ABC
# CBA
# 2
# Mo Sa 45+2 Y
# A 13 G
# 2
# D 23 S F
# Z 46 G

