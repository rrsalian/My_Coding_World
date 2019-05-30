import matplotlib.pyplot as plt

x1=[1,2,3,4,5]
y1=[7,4,2,5,6]

x2=[5,2,4,8,9]
y2=[3,4,6,8,3]

plt.subplot(2,3,1)
plt.plot(x1,y1,label="first")
plt.xlabel("X1")
plt.ylabel("Y1")
plt.title("First")
plt.legend()

plt.subplot(2,3,2)
plt.plot(x2,y2,label="second")
plt.xlabel("X2")
plt.ylabel("Y2")
plt.title("Second")
plt.legend()

#plt.show()


plt.subplot(2,3,6)
plt.plot(x2,y2,label="second")
plt.xlabel("X2")
plt.ylabel("Y2")
plt.title("third")
plt.legend()

#plt.subplot(2,5,3)
#plt.plot(x1,y1,label="first")
#plt.xlabel("X1")
#plt.ylabel("Y1")
#plt.title("fourth")
#plt.legend()


plt.show()