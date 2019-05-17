class Person:
    def __init__(self,firstName,lastName):
        self.firstName=firstName
        self.lastName=lastName
    def display(self):
        print("first Name",self.firstName,"LastName",self.lastName)
    def __str__(self):
        return "first Name "+self.firstName+" LastName "+self.lastName
p1=Person("adsfas","fasaa")
p1.display()
print(p1)
