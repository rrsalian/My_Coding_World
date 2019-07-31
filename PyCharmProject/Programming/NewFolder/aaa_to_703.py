s=input().upper()

l=[chr(i) for i in range(65,91)]
sum = 0;
p = 0;
for i in s[::-1]:
    sum += (l.index(i)+1)* (26**p)
    p+=1

print(sum)