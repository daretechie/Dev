from django.db import models

# Create your models here.

BRANDS = (
    ('HN', 'Honda'),
    ('TY', 'Toyota'),
    ('MD', 'Mercedes'),
    ('BMW', 'BMW'),
)


class Vehicle(models.Model):
    vehicle_registration_number = models.CharField(max_length=16, blank=False)
    vehicle_color = models.CharField(max_length=16)
    vehicle_image = models.ImageField(upload_to='media/')

    vehicle_brand = models.CharField(max_length=32, choices=BRANDS)
    vehicle_manufactured = models.DateField(auto_now_add=True)

    def __str__(self):
        return self.vehicle_registration_number
