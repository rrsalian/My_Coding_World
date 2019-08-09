import pandas as pd
dict1 ={'a':1, 'b':2, 'c':3, 'd':4,'e':5} 
dict2 ={'a':5, 'b':6, 'c':7, 'd':8} 
Data = {'first':dict1, 'second':dict2} 
df = pd.DataFrame(Data) 
print(df)