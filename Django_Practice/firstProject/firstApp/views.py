from django.shortcuts import render
from django.http import HttpResponse
from firstApp.models import Employ

# Create your views here.

def index(request):

	

	emp=Employ.objects.all()
	emp_dict={'emp':emp}

	return render(request,"firstApp/index.html",context=emp_dict)
