class Demo():
    def __init__(self,n):
        self.n=n
    def __iter__(self):
        return self
    def __next__(self):
        if self.n<=10:
            print(self.n)
            self.n+=1
        else:
            raise StopIteration
print()
d=Demo(5)
i=iter(d)

next(i)
next(i)
next(i)
next(i)
next(i)
next(i)

