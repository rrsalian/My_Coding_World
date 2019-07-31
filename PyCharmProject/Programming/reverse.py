s=input().upper()

n=0

k=len(s)-1
for i in s:
    n+=(ord(i)-64)*(26**k)
    k-=1

print(n)