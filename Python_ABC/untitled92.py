s2=((input("Enter the input String: ")).lstrip()).rstrip()

i=c=0

while i<len(s2):
    if s2[i]==' ' and s2[i+1]!=" ":
        c+=1
    i+=1
    
print("NO of words",(c+1))

