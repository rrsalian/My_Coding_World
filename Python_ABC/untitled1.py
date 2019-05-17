def vowels(l):
    count=0
    for i in str(l):
        if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u'):
            count+=1
    return count

def consonent(l):
    count=0
    for i in str(l):
        if(i!='a' or i!='e' or i!='i' or i!='o' or i!='u'):
            count+=1
    return count

def words(l):
    count=0
    for i in str(l):
        if(i==" "):
            count+=1
    return count

def special(l):
    count=0
    for i in str(l):
        pass 

with open("D:\dummy.txt",'r',encoding='utf-8') as f:
    
    l=f.read()
    print("No of vowels",vowels(l))
    print("NO of Consonent",consonent(l))
    print("NO of words",words(l))
    #print"No of special character",special(l))
    
    