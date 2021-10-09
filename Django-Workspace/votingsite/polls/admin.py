from django.contrib import admin
from .models import Choice, Question

class ChoiceInline(admin.TabularInline):
    model = Choice
    extra = 0


class QuestionAdmin(admin.ModelAdmin):
    fieldsets = [
        ('A New Question', {'fields': ['question_text']}),
        ("Date Information", {'fields': ['pub_date']}),
    ]

    inlines = [ChoiceInline]
    list_display = ('question_text', 'pub_date', 'was_published_recently')

admin.site.register(Question, QuestionAdmin)
