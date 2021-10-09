from django.contrib import admin
from comments.models import Comment

# Register your models here.

class CommentAdmin(admin.ModelAdmin):
    list_display = ["comment", "upvotes" , "downvotes", 'report', 'timestamp']

admin.site.register(Comment, CommentAdmin)