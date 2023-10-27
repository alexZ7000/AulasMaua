from django.db import models
import uuid
from django.contrib.auth.models import User 

# Create your models here.
class PasswordResetToken(models.Model):
    user = models.UUIDField(User) 