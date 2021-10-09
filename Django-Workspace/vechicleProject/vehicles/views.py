from django.shortcuts import render
from django.http import HttpResponse


# Create your views here.

def index(request):
    data = []
    return render(request, 'index.html', data)


def login(request):
    return HttpResponse("<pre>Learning django views with httprespomse </pre>")
