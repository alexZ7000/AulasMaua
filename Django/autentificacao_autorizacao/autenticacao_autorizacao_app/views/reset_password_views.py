from ..models import PasswordResetToken
from rest_framework import status
from rest_framework.decorators import api_view
from rest_framework.response import Response
from django.core.mail import send_mail
from autenticacao_autorizacao_app.serializers import UserSerializers
import uuid 
from django.contrib.auth.models import User 


@api_view(['POST'])
def request_password_reset(request):
    serializer = UserSerializers(data=request.data)
    try:
        email = request.data.email
        user = User.objects.get(email)
        random_id = uuid.uuid4() 
        user_object = PasswordResetToken.objects.create(random_id) 
        user_object.save()
        reset_token = PasswordResetToken(user=user)
        reset_token.save()
        reset_link = build_user_link(reset_token)
        send_mail(
                subject="redefinir senha", 
                message=f"vá até esse link para redefinir sua senha {reset_link}", 
                from_email=None, 
                recipient_list=['alessandrolimafilho@gmail.com'], 
                fail_silently=False
            )
        return Response(status=status.HTTP_200_OK)
    except:
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)
    
def build_user_link(reset_token):
    reset_link = f'http://127.0.0.1:8000/{reset_token.token}'
    return reset_link

@api_view(['POST'])
def reset_password(request, token):
    reset_token = PasswordResetToken.objects.get(token=token)
    if (reset_password):
        password = request.data.password
        request.objects.get(password)
        new_password = password['password']
        reset_token.user.set_password(new_password)
        reset_token.user.save()
        reset_token.delete()
        return Response(status=status.HTTP_200_OK)
    else:
        return Response(status=status.HTTP_400_BAD_REQUEST)

