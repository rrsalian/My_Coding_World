import mysql.connector
import re

try:
		#Database Connction
	connection=mysql.connector.connect(host='localhost',database='emp',user='root',password='root')
	cursor=connection.cursor()


	l=[]
	#Storing the data in list
	with open("sample_data.txt","r") as f:
		for i in f.readlines():
			l.append(i)
		f.close()

	#Removeing the special character
	for i in range(len(l)):
		l[i]=re.sub(r'[^a-zA-Z0-9,]', '', l[i])
		l[i]=l[i].replace(" ","")
		l[i]=l[i].split(",")


	#Correcting Firstname
	for i in range(len(l)):
		k=len(l[i])
		
		if k<5:
			continue
		
		l[i][1]=re.search('[A-Z]+[a-z]+$', l[i][1]).group(0)


	#Removeing the empty row 	
	n=[]
	for i in l[1:]:
		if len(i)==5:
			i[0]=int(i[0])
			n.append(tuple(i))

	#create query
	sql_query="""INSERT INTO emp_details (`Id`,`First name`,`Last Name`,`deparment`,`salary`) values(%s,%s,%s,%s,%s)
	ON DUPLICATE KEY UPDATE `Id`=values(`Id`), `First name`=values(`First name`), `Last Name`=values(`Last Name`), `deparment`=values(`deparment`),`salary`=values(`salary`);"""
	cursor.executemany(sql_query,n)
	connection.commit()

except Exception as e:
	print("Exception occured:",e)