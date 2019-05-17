n = int(input())
l = []
for i in range(n):
    s = "-".join(chr(ord('a') + n - j - 1) for j in range(i + 1))
    print((s + s[::-1][1:]).center(n * 4 - 3, '-'))
    l.append((s + s[::-1][1:]).center(n * 4 - 3, '-'))

for i in l[-2::-1]:
    print(i)

# for i in range(n-1):
#    s = "-".join(chr(ord('a')+n-j-1) for j in range(n-i-1))
#    print((s+s[::-1][1:]).center(n*4-3, '-'))