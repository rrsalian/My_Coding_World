def count(s):
    if len(s)!=0:
        count=0
        for i in range(len(s)-1):
            if(s[i]==' ' and s[i+1]!=' '):
                count+=1
        
        
        return (count+1) 
def sten(s):
    start=0
    end=0
    for i in range(len(s)-1):
        if s[i]!=' ':
            start=i
            break
    for i in range(len(s)-1,0,-1):
        if s[i]!=' ':
            end=i
            break
    s=s[start:end+1]
    return s

n=input()
n=sten(n)
print(count(n))