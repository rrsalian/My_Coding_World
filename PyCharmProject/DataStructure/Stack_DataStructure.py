class Stack_Ds:
    def __init__(self,n):
        self.n = n
        self.size=0
        self.l=[]
        self.top=-1

    def isEmpty(self):
        if self.top==-1:
            return True
        else:
            return False
    def isFull(self):
        if self.top==self.n-1:
            return True
        else:
            return False
    def peek(self):
        if(self.isEmpty()):
            print("Stack is Empty ")
        else:
            return self.l[self.top]

    def push(self,item):
        if(self.isFull()):
            print("Stack is Full")
        else:
            self.l.append(item)
            self.top+=1
    def pull(self):
        if(self.isEmpty()):
            print("Stack is Empty")
        else:
            self.top-=1
            return self.l.pop()

    def display(self):
        if(self.isEmpty()):
            print("Stack is Empty")
        else:
            for i in self.l:
                print(i," ",end="")



stack=Stack_Ds(11)

stack.push(1)
stack.push(2)
stack.push(3)
stack.push(4)
stack.push(5)
stack.push(6)
stack.display()
print()
print(stack.peek())

stack.display()
print()
print(stack.pull())
print()
stack.display()





