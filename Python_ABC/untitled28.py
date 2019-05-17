n=int(input())

try:
    if n<0:
        raise ValueError("Value should be positive")
except ValueError as v:
    print(v)
except:
    print("error")
    