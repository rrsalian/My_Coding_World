
	
import os
path = 'E:\MY_Coding_World\Django_Project\PhotoBook\static\images'
files = os.listdir(path)
print(files)


for index, file in enumerate(files):
    os.rename(os.path.join(path, file), os.path.join(path, 'image'+str(index)+'.jpg'))