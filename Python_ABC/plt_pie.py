import matplotlib.pyplot as plt

names = 'Python', 'C++', 'Ruby', 'Java'

sizes = [200, 130, 150, 210]

color = ['orange', 'yellow', 'blue', 'red']

out = (0.1, 0.2, 0.3, 0.4)

plt.pie(sizes, explode=out, labels=names, colors=color,
        autopct='%1.2f%%', shadow=True, startangle=45)

#plt.axis('equal')

plt.show()

