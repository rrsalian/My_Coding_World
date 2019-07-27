n=int(input())

v=n*n

l=[[0]*n for i in range(n)]

left=top=0
bottom=right=n-1
print(l)
while top<=bottom and left<=right:
    for i in range(left,right+1):
        l[top][i]=v
        v-=1
    top+=1

    for i in range(top,bottom+1):
        l[i][right]=v
        v-=1
    right-=1

    for i in range(right,left-1,-1):
        l[bottom][i]=v
        v-=1
    bottom-=1

    for i in range(bottom,top-1,-1):
        l[i][left]=v
        v-=1
    left+=1

for i in l:
    print(i)