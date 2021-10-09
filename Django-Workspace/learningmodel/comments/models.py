from django.db import models

# Create your models here.

class Comment(models.Model):

    comment = models.CharField(max_length=1024, blank=False)
    upvotes = models.PositiveIntegerField('Up Votes', default=0)
    downvotes = models.IntegerField('Down Votes',default=0)

    report = models.CharField(max_length=1024, blank=True)
    timestamp = models.DateTimeField(auto_now_add=True)

    def _str_(self):
        return self.comment