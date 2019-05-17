class Person:
    def __init__(self):
        self.name=input("Enter the name:")
        self.age=input("Enter the age: ")
        self.gender=input("Enter the gender: ")
        
    def disp(self):
        print("Name :",self.name)
        print("Age :",self.age)
        print("Gender :",self.gender)
        
class Marks:
    def __init__(self):
        self.m1=int(input("Enter the M1 Mark: "))
        self.m2=int(input("Enter the M2 Mark: "))
        self.m3=int(input("Enter the M3 Mark: "))
    def disp(self):
        print("Total Mark",(self.m1+self.m2+self.m3))
        
class Student(Person,Marks):
    def __init__(self):
        Person.__init__(self)
        Marks.__init__(self)
    def result(self):
        Person.disp(self)
        Marks.disp(self)

s1=Student()
s1.result()

s2=Student()
s2.result()        