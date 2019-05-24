def demo():
    print("A")
    yield
    print("B")
    yield
    print("c")

print()
d=demo()
next(d)
next(d)
