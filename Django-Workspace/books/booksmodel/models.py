from django.db import models
# Create your models here.

class Book(models.Model):

    bookTitle = models.CharField("Book Title", max_length=120)
    bookAuthor = models.CharField("Book Author", max_length=64)
    publisher = models.CharField("Publisher", max_length=64)

    timestamp = models.DateField(auto_now_add=True)

    def _str_(self):
        return self.bookTitle
