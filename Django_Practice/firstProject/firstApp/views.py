from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.

def index(request):

	my_dict={"msg":"Hi, How are You??"}

	return render(request,"firstApp/index.html",context=my_dict)
