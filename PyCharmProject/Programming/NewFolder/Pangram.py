s=input("Enter the String : ").lower()

s.replace(" ","")
s=list(set(s))


s=sorted(s)
s1=""
s1=s1.join(s)

if len(s1)==26:
    print("Panagram")

else:
    print("Not a Panagram")

