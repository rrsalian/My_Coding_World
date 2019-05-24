s1=input("Enter the first String : ")
s2=input("Enter the Second String : ")

s1=s1.lower()
s2=s2.lower()

s1=s1.replace(" ","")
s2=s2.replace(" ","")

s1=sorted(s1)
s2=sorted(s2)

s1=s1.join("")

if s1==s2:
    print("Anagram")
    
else:
    print("Not Anagram")

print(s1)
print(s2)

