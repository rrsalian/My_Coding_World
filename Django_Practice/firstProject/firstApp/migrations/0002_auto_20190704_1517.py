# Generated by Django 2.1.7 on 2019-07-04 09:47

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('firstApp', '0001_initial'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='employ',
            name='dep',
        ),
        migrations.AlterField(
            model_name='employ',
            name='ename',
            field=models.CharField(max_length=50, unique=True),
        ),
        migrations.AlterField(
            model_name='name',
            name='name',
            field=models.CharField(max_length=50, unique=True),
        ),
    ]
