
h_no=7


class ValueToLargeError(Exception):
        pass
class ValueToSmallError(Exception):
    pass
d=True
c=0;
while(d):
    n=int(input('Enter a no 1 to 10: '))
    c+=1
    try:
        if n>h_no:
            raise ValueToLargeError("the value is  large")
        if n<h_no:
            raise ValueToSmallError("Value is  Small")
        if n==h_no:
            d=False
            if(c<=3):
                print("congratulation")
            else:
                print("looser your attempt",c)
    
    except ValueToLargeError as e:
        print(e)
    except ValueToSmallError as f:
        print(f)
    except:
        print("Error")
    
    