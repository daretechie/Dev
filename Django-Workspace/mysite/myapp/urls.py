from django.urls import path
from . import views

urlpatterns = [

    path('', views.home, name='home'),
    path('about/', views.about, name='about'),
    path('services/', views.service, name='service'),
    path('team/', views.team, name='team'),
]