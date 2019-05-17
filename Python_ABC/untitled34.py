a='PHIKA and Python'
b=a.casefold()=="phika AND pYTHON"
#print(a.casefold())

class rak:
    def __init__(self):
        self.thing=14
        
r=rak()
m=r
m.thing=15

print(b, r.thing)