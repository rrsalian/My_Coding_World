from django.shortcuts import render
from django.http import HttpResponse
import datetime

# Create your views here.
def greet_disp(requset):

	t=datetime.datetime.now()
	L=int(t.strftime('%H'))

	if L<12:
		msg='Good Morning'
	if L<16:
		msg='Good Noon'
	if L<20:
		msg='Good Evening'
	if L<24:
		msg='Good Night'

	my_dict={'ins_time':t, 'ins_msg':msg}

	return render(requset, 'GreetApp/index.html',my_dict)
