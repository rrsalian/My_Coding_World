from django.shortcuts import render
from django.http import HttpResponse
from FormApp.forms import UserForm
# from FormApp.model import User

# Create your views here.

def index_view(request):
	return render(request,"FormApp/index.html")

def form_view(request):
	# user_list=User.objects.all()
	form=UserForm()

	if request.method =="POST":
		form=UserForm(request.POST)

		if form.is_valid():
			form.save(commit=True)
			return index_view(request)
		else:
			print('Error Form')

	return render(request,'FormApp/user.html',{'form':form}) 
