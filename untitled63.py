import matplotlib.pyplot as plt
 

slices = [7,2,2,13]
activities = ['sleeping','eating','working','playing']
cols = ['c','m','r','b']
exp=(0,.5,0,0)
plt.pie(slices,labels=activities,colors=cols,startangle=0,
        shadow= False,explode=exp,autopct='%.3f%%')
 
plt.title('Pie Plot')
plt.show()