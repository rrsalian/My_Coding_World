from django.shortcuts import render

from cookieapp import forms
import datetime

# Create your views here.
def home_view(request):
	home=forms.HomePage()
	my_dic={'home':home}
	return render(request,'cookieApp/home.html',context=my_dic)


def date_view(request):
	client_name=request.GET['name']
	print(client_name)
	my_dic={'client_name':client_name}
	response=render(request,'cookieApp/date.html',context=my_dic)
	response.set_cookie('client_name',client_name)
	return response


def result_view(request):
	client_name=request.COOKIES['client_name']
	date=datetime.datetime.now()
	my_dic={'insert_date':date,'client_name':client_name}
	return render(request,'cookieApp/result.html',context=my_dic)






