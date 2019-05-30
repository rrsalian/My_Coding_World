import matplotlib.pyplot as plt
 

slices = [7,2,2,13]
activities = ['sleeping','eating','working','playing']
cols = ['c','m','r','b']
 
plt.pie(slices,
labels=activities,
colors=cols,
startangle=0,
shadow= False,
explode=(0,100,0,0),
autopct='%1.1f%%')
 
plt.title('Pie Plot')
plt.show()