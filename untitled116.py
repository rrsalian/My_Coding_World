from matplotlib import pyplot as plt
import seaborn as sb

x=[0,1,2,3,4,5,6,7,8,9,10]
y=[50,20,30,5,15,30,55,10,25,45,35]
plt.plot(x,y,linewidth=5)
plt.xlabel("x-axis")
plt.ylabel("y-axis")
plt.title("Seaborn Example")

#sb.set_style("whitegrid")
#sb.set()
#sb.set_style("white")

#sb.set_style("darkgrid", {'axes.axisbelow': False})
#sb.despine()

#sb.set_style("white")
#sb.set_palette("husl")

plt.show()