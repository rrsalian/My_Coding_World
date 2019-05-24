def demo1(func):
    def inner(a,b):
        if b==0:
            print("not possible")
        else:
            return func(a,b)
    return inner

@demo1
def demo2(a,b):
    print("a/b =",a/b)
print()
d=demo2(10,5)

