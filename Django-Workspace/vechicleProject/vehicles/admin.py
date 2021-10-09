from django.contrib import admin
from .models import Vehicle
# Register your models here.


class VehicleAdmin(admin.ModelAdmin):

    list_display = ['vehicle_registration_number', 'vehicle_image', 'vehicle_brand', 'vehicle_manufactured']

admin.site.register(Vehicle, VehicleAdmin)