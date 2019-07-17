from django.shortcuts import render
from django.http import HttpResponse
from DispApp.models import Details

# Create your views here.
def disp(request):
	return render(request,"DispApp/disp.html")

def info(request):
	s=str(request.POST.get('name'))
	Det=Details.objects.get(Name=s)
	return render(request,"DispApp/res.html",{"det":Det})