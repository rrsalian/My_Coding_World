n=input()

def removeSpace(s):
    t=''
    for i in s:
        if i.isalpha():
            t+=i
    return t

n=removeSpace(n.lower())
n=set(n)
if len(n)==26:
    print("Panagram")
else:
    print("not Panagram")