from django.shortcuts import render
from django.shortcuts import HttpResponse

def homePageView(request):
    return HttpResponse('Hello, World!')
