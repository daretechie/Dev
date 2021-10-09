from django.shortcuts import render

# Create your views here.

def home(request):
    return render(request, "index.html")

def about(request):
    return render(request, 'about.html')

def service(request):
    return render(request, 'services.html')

def team(request):
    return render(request, 'team.html')
