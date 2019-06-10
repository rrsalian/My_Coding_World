s1=((input("Enter the 1st String :")).replace(" ","")).lower()
s2=((input("Enter the 2st String :")).replace(" ","")).lower()

if (len(s1)==len(s2) and sorted(s1)==sorted(s2)):
        print("Anagram")
else:
    print("Not Anagram")
    

