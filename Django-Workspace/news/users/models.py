from django.db import models
from django.contrib.auth.models import AbstractUser


class CustomUser(AbstractUser):  # we extend the django abstractUser classs
    age = models.PositiveIntegerField(null=True, blank=True)  # New custom field

# Create your models here.
