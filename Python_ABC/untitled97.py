if(len(set([i for i in sorted(((input("Enter the string :")).replace(" ",""))) if i.isalpha()])))==26:
    print("Panagram")
else:
    print("Not panagrm")
