from django.shortcuts import render
from django.http import HttpResponse
import datetime

# Create your views here.

def date_display(request):
	time=datetime.datetime.now()
	my_date={'insert_time':time}
	return render(request,'TimeApp\index.html',context=my_date)

