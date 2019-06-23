from django.db import models

# Create your models here.

class Employee(models.Model):

	eno = models.IntegerField()
	ename = models.CharField(max_length=20)
	eaddr = models.CharField(max_length=50)
	
    # class Meta:
    #     verbose_name = "MODELNAME"
    #     verbose_name_plural = "MODELNAMEs"

    # def __str__(self):
    #     pass
	def __str__(self):
		return '%s' % self.ename
	    
 