class Demo:
    def __init__(self):
        self.__a=30


d=Demo()
#print(d.__a)
print(d._Demo__a)
d._Demo__a=50
print(d._Demo__a)