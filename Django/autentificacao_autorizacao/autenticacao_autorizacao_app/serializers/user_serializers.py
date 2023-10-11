from django.contrib.auth.models import User
from rest_framework import serializers
import re

class UserSerializers(serializers.ModelSerializer):
    password = serializers.CharField(write_only=True)

    def validate_password(self, password):
        if not re.search('[0-9]', password) or len(password) != 6:
            raise serializers.ValidationError("A senha deve conter somente 6 dígitos")

    class Meta:
        model = User
        fields = ['id', 'username', 'password', 'email',]



