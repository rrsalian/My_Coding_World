from django.shortcuts import render
from student.models import student
# Create your views here.
def display_record(request):
	student_record=student.objects.all()
	my_dict={'records':student_record}

	return render (request,'student/record.html',my_dict)
