import pandas as pd

data=[1,2,3,4,5]
index=['f','s','t','f','fi']
a=pd.Series(data)
b=pd.Series(data,index)

print(a)

print(b)