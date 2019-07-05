from django.db import models

# Create your models here.

class Employ(models.Model):
	ename = models.CharField(max_length=50,unique=True)
	sal = models.IntegerField()

	def __str__(self):
		return self.ename
		
class Name(models.Model):
	name = models.CharField(max_length=50,unique=True)