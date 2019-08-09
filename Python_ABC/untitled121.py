import requests

url="http://ide.geeksforgeeks.org/main.php"

code="print('eee')"

data={
'lang':'Python',
'code':code,
'input':"Hello",
'save':True
}

r=requests.post(url,data=data)
print(r)
print(r.text)