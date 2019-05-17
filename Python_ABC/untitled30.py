import sys
l=["hello",0,1,2,'bye']

for i in l:
    try:
        print("the value is ",i)
        r=1/int(i)
        print(r)
    except:
        print("the exception is ",sys.exc_info()[0])