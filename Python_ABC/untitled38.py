import matplotlib.pyplot as plt

x=[0,2,4,6,8,10]
y=[10,8,6,4,2,1]
z=['Python','C++','Java', 'Perl','Scala','Lisp']

plt.bar(x,y)
plt.xticks(x,z)

plt.show()