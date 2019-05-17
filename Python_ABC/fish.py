n=int (input())
#1
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n-i):
         print("  ",end='')
    for j in range(i+1):
        print("* ",end='')
    print()
#2
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n-i):
         print("  ",end='')
    for j in range(i+1):
        print("* ",end='')
    for j in range(i+1):
        print("* ",end='')
    print()
#3
for i in range(n):
    for j in range(n-i):
        print("  ",end='')
    for j in range(i+1):
         print("* ",end='')
    for j in range(n):
        print("* ",end='')
    for j in range(n):
        print("* ",end='')
    for j in range(i+1):
        print("* ",end='')
    for j in range(n-i-1):
        print("  ",end='')
    for j in range(n-i-1):
        print("  ",end='')
    for j in range(i+1):
        print("* ",end='')
    print()
    
#4
for i in range(n):
    for j in range(i+1):
        print("  ",end='')
    for j in range(n-i):
        print("* ",end='')
    for j in range(n):
        print("* ",end='')
    for j in range(n):
        print("* ",end='')
    for j in range(n-i):
        print("* ",end='')
    for j in range(i):
        print("  ",end='')
    for j in range(i):
        print("  ",end='')
    for j in range(n-i):
        print("* ",end='')
    print()
#5
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(i+1):
        print("  ",end='')
    for j in range(n-i):
        print("* ",end='')
    for j in range(n-i):
        print("* ",end='')
    print()
#6
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(i+1):
        print("  ",end='')
    for j in range(n-i):
        print("* ",end='')
    print() 
        
       