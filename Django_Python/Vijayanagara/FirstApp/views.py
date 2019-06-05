from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.

def welcome_to_django(request):
	s='<center><h1 style="color:blue">Welcome to ABC </br>This is Django</h1></center>'
	return HttpResponse(s)
