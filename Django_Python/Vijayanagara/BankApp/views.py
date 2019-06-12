from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.

def update_user(request):
	s="<h1>Updating the user with the Account no</h1>"
	return HttpResponse(s)

def delete_user(request):
	s="<h1>Deleting the user with the Account no</h1>"
	return HttpResponse(s)

def insert_user(request):
	s="<h1>Inserting the user with the Account no</h1>"
	return HttpResponse(s)