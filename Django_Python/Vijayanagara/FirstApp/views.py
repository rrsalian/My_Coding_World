from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.

def welcome_template(request):
	return render(request,'FirstApp\index.html')
	

	
