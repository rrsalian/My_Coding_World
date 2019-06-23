from django import forms

class EmployeeRegistraion(forms.Form):
	name = forms.CharField()
	email = forms.EmailField()
	age = forms.IntegerField()