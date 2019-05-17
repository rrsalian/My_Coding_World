class Rectangle:
    def __init__(self,l,w):
        self.l=l;
        self.w=w;
        print("I'm in Rectangle")

    def area(self):
        print("Rectangle Area is =",(self.l* self.w))

    def peri(self):
        print ("Rectangle Perimeter =", 2*(self.l* self.w))

class Square1(Rectangle):
    def __init__(self,s):
        Rectangle().__init__(s,s)
        print("I'm in Square1")

class Square2(Square1):
    def __init__(self,s):
        Rectangle().__init__(self,s,s)
        print("I'm in Square2")

p1=Rectangle(5,2)

