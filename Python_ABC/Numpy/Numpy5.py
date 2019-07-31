import numpy as np

#print(np.random.rand(5))

#print(np.random.rand(5,5))

#print(np.random.randn(5))

#print(np.random.randn(5,5))

#print(np.random.randint(1,100))

#print(np.random.randint(1,100,10))

a=np.random.randint(1,100,25)
print(a)
#print(a.reshape(5,5))

print(a.max())
print(a.min())
print(a.argmax())
print(a.argmin())