f=open("E:\demo.txt",'r',encoding='utf-8')




print(f.read(9))
print(f.tell())
print(f.seek(0))
print(f.read(3))
print(f.readline())