from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.

def wordhome(request):
	return render(request,'wordcount\home.html')

def logic(request):

	s=request.GET['fulltext']

	count=len(s.split())

	return render(request,'wordcount\count.html',{"count":count, "s":s})

def about(request):
	return render(request,'wordcount//about.html')