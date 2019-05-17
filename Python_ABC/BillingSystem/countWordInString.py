def count(s):
    count=0
    for i in range(len(s)-1):
        if(s[i]==' ' and s[i+1]!=' '):
            count+=1
    count+=1
    return count

n=input()
print(count(n))