from django.contrib import admin
from student.models import student

# Register your models here
class studentAdmin(admin.ModelAdmin):
    '''
        Admin View for student
    '''
    list_display = ('sname','saddr','sage')
   

admin.site.register(student, studentAdmin)
