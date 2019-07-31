s=input("Enter the subString: ")
sub=input("Enter the Substring: ")

k=0
l=len(sub)
j=True
for i in s:
    if i==sub[k]:
        k+=1
    else:
        k==0
    if k==l:
        print(sub," IS PRESENT IN ", s)
        j=False
        break
if j==True:
    print(sub," IS NOT PRESENT IN ", s)
