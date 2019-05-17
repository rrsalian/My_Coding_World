a=''
try:
    with open("D:\dummy.txt",'r',encoding='utf-8') as f:
        a+=f.read()
        #print(f.readlines())
    wc=vc=cc=sp=para=c=0
    
    t=a
    t=t.replace(",","")
    t=t.replace(".","")
    
    for i in t :
        if i==" ":
            wc+=1
        elif i=="\n":
            c+=1
            if c%2==0:
                wc+=1
                para+=1
                c=0
    print("word count",wc+1)
    print("para count",para+1)
    
    for i in a.lower():
        if (i>='a' and i<='z'):
            if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u'):
                vc+=1
            else:
                cc+=1
        else:
            sp+=1
    print("vowel count",vc)
    print("consonent count",cc)
    print("special character count",sp)
except:
    print("File not found Error")