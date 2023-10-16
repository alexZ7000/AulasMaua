from rest_framework import views, status
from rest_framework.response import Response
from autenticacao_autorizacao_app.serializers import UserSerializers
from django.contrib.auth.models import User


class CadastroNovoUsuarioView(views.APIView):
    def post(self, request):
        print(request)
        print(request.data)
        serializer = UserSerializers(data=request.data)
        if serializer.is_valid():
            user = User.objects.create_user(**serializer.validated_data) #por ser um dicionário nós colocamos dois asteriscos
            return Response(UserSerializers(user).data, status=status.HTTP_201_CREATED) #boa prática devolver os dados do usuario via objeto
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)
    
                        