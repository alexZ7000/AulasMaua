from rest_framework import status, views
from django.contrib.auth.models import User
from rest_framework.response import Response
from rest_framework.permissions import AllowAny
from autenticacao_autorizacao_app import serializers

def CadastroNovoUsuario(views.APIView):
    #Pesquisar diferença entre pass e ...
    def post(self, request, format=None):
        serializer = serializers.CadastroNovoUsuarioSerializer(data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data, status=status.HTTP_201_CREATED)
        return Response(serializer.erros, status=status.HTTP_400_BAD_REQUEST
                        