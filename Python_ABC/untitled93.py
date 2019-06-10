s1=input("Enter the 1st String :")
s2=input("Enter the 2st String :")

s1=s1.replace(" ","")
s2=s2.replace(" ","")

if (len(s1)==len(s2)):
    s1=s1.lower()
    s2=s2.lower()
    s1=sorted(s1)
    s2=sorted(s2)
    if(s1==s2):
        print("Anagram")
    else:
        print("not Anagram")
else:
    print("Not Anagram")
    

