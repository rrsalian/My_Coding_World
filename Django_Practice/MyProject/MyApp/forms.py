from django import forms
from django.contrib.auth.models import User
from MyApp.models import UserProfileInfo

class UserForm(forms.ModelForm):
	password = forms.CharField(widget=forms.PasswordInput())

	class Meta():
		model=User
		filed=('username','email','password')


class UserProfileInfoForm(forms.ModelForm):
	class Meta():
		model=UserProfileInfo
		filed=('portfolio_site','profile_pic')