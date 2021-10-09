from django.db import models

# Create your models here.

class Todo(models.Model):

    todo = models.CharField(max_length=128, blank=False)
    isCompleted = models.BooleanField(default=False) 

    def __str__(self):
        return self.todo 