
n=int (input())

#1st
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        if j==0:
            print("|",end='')
    print()
#2nd
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        if j==0 :
            print("||",end='')
        elif i==0 :
            print("@ ",end='')
        else:
            print("  ",end='')
    for j in range(n):
        if i==j and i!=0:
            print("@ ",end='')
        else:
            print("  ",end='')
    print()
#3rd
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        if i==0 or i==1:
            print("# ",end='')
        else:
            print("  ",end='')
    for j in range(n):
        if i==0 or i==1:
            print("# ",end='')
        elif j==0:
            print("||",end='')
        else:
            print(",,",end='')
    for j in range(n):
        if i==0 or i==1:
            print("# ",end='')
        else:
            print(",,",end='')
    for j in range(n):
        if i==0 or i==1:
            print("# ",end='')
        elif i==j and i!=n-1:
            print("@ ",end='')
        else:
            if i>j:
                print(",,",end='')
    print()
 
 #4
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        if j==0:
            print("||",end='')
        else:
            print(",,",end='')
    for j in range(n):
        print(",,",end='')
    for j in range(n):
        if j==n-1 :
            print("@ " ,end='')
        else:
            print(",,",end='')
    print()

#5
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        if j==0:
            print("||",end='')
        else:
            print(",,",end='')
    for j in range(n):
        print(",,",end='')
    for j in range(n):
        if j==n-1:
            print("@ " ,end='')
        else:
            print(",,",end='')
    print()
    
 #6
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        if j==0:
            print("||",end='')
        else:
            print(",,",end='')
    for j in range(n):
        print(",,",end='')
    for j in range(n):
        if j==n-1 :
            print("@ " ,end='')
        else:
            print(",,",end='')
    print()   
    
#7
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        if j==0:
            print("||",end='')
        else:
            print(",,",end='')
    for j in range(n):
        print(",,",end='')
    for j in range(n):
        if i+j==n-1 and i!=0:
            print("@ " ,end='')
        else:
            if i+j<n and (i!=0 or j<n-1):
                print(",,",end='')
    print()   

#8
for i in range(n):
    for j in range(n):
        print("  ",end='')
    for j in range(n):
        if i==1 :
            print("##",end='')
        else:
            print("  ",end='')
        
    for j in range(n):
        if i==0:
            print("##",end='')
        elif i==1 :
            print("##",end='')
        else:
            print("  ",end='')
    for j in range(n):
        if i==0:
            print("##",end='')
        elif i==1 :
            print("##",end='')
        else:
            print("  ",end='')
    for j in range(n):
        if i==0:
            print("##",end='')
        elif i==1 :
            print("##",end='')
        else:
            print("  ",end='')
    for j in range(n):
        if i==0:
            print("##",end='')
        elif i==1 :
            print("##",end='')
        else:
            print("  ",end='')
    for j in range(n):
        if i==1 :
            print("##",end='')
        else:
            print("  ",end='')
    print()   






 