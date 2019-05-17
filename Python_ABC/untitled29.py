try:
    s=input("enter the string")
    if(s.isdecimal()):
        raise ValueError("Enter String only")
    
except ValueError as v:
    print(v)

    