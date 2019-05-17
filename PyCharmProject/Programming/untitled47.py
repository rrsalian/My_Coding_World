class ICICI:
    def __init__(self):
        self.__fdint=6.8
    def dis(self):
        print("fd intrest" ,self.__fdint)
        
    def setint(self,i):
        self.__fdint=i


c=ICICI()
c.dis()

c.__fdint=4.5
print(c.__fdint)
c.dis()

c.setint(9.1)
c.dis()