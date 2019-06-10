"""Vijayanagara URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/2.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from FirstApp import views
from TimeApp import views as v2
from GreetApp import views as v3
from GreetImg import views as v4

urlpatterns = [
    path('admin/', admin.site.urls),
    path('',views.welcome_template),
    path('time/',v2.date_display),
    path('greet/',v3.greet_disp),
    path('greetImg',v4.greet_img),
]
