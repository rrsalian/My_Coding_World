from django.db import models

# Create your models here.
class Details(models.Model):
	Name = models.CharField(max_length=50)
	addres = models.CharField( max_length=50)
	Nationality = models.CharField( max_length=50)
