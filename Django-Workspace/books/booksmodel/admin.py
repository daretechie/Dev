from django.contrib import admin
from booksmodel.models import Book
# Register your models here.


class BookAdmin(admin.ModelAdmin): 

    list_display = ['bookTitle', 'bookAuthor', 'publisher', 'timestamp']

admin.site.register(Book, BookAdmin)