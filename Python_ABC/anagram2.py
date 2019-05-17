s1=input('enter the first string :  ')
s2=input('enter the second string:  ')
def removeSpace(s):
    t=''
    for i in s:
        if i.isalpha():
            t+=i
    return t
s1=removeSpace(s1)
s2=removeSpace(s2)
s1=(''.join(sorted(s1.lower())))
s2=(''.join(sorted(s2.lower())))
if(s1==s2):
    print("Anagram")
else:
    print("not anagram")
