from django.shortcuts import render
from django.http import HttpResponse
import datetime

# Create your views here.

def greet_img(request):

	time=datetime.datetime.now()
	h=int(time.strftime('%H'))

	if h<12:
		msg="Hello, Good Morning"
	elif h<16:
		msg="Hello, Good Evening"
	elif h<20:
		msg="Hello, Good Evening"
	else:
		msg="Hello, Good Evening"

	my_dict={"time":time,'greet':msg}

	return render(request,'GreetImg/greet.html',my_dict)






