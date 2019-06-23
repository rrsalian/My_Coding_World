from django.shortcuts import render
from FormApp import forms

# Create your views here.

def registration_view(request):
	form_page=forms.EmployeeRegistraion()
	my_dict={'insert_form':form_page}

	return render(request,'Registration/input.html',context=my_dict)


