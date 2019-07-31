import pandas as pd

s1 = pd.Series([1, 3, 4, 5, 6, 2, 9]) 
s2 = pd.Series([1.1, 3.5, 4.7, 5.8, 2.9, 9.3]) 
s3 = pd.Series(['a', 'b', 'c', 'd', 'e'])


Data ={'first':s1, 'second':s2, 'third':s3} 
dfseries = pd.DataFrame(Data) 

print(dfseries)
