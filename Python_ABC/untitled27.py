l=['A',2,5,'c']
for i in l:
    try:
            print(i/0)
    except TypeError:
        print("you cannot divide character by no's")
    except ZeroDivisionError:
        print("no can't be divisible by zero")
    except:
        print("unknown exception .please check the code")