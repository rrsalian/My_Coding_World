def demo(n):
    def demo1(m):
        print(n*m)
        
    return demo1

d=demo(5)
d(3)
d(4)
