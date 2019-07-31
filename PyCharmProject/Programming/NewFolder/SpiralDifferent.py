
n=int(input("Enter the no"))


l=[[0]*n for i in range(n)]

num=n*n

top=left=0
bottom=right=n-1

while top<=bottom and left<=right:
    for i in range(left,right+1):
        l[top][i]=num
        num-=1
    top+=1
    
    for i in range(top,bottom+1):
        l[i][right]=num
        num-=1
    right-=1
    
    for i in range(right,left-1,-1):
        l[bottom][i]=num
        num-=1
    bottom-=1
    
    for i in range(bottom,top-1,-1):
        l[i][left]=num
        num-=1
    left+=1
   
        
print(l)    