import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

import '../blocs/bloc.dart';
import '../blocs/provider.dart';

class LoginTela extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final bloc = Provider.of(context);
    return Container(
      margin: EdgeInsets.all(20.0),
      child: Column(children: [
        emailField(bloc),
        passwordField(bloc),
        Row(
          children: [
            Expanded(
              child: Container(
                margin: EdgeInsets.only(top: 12.0),
                child: submitButton(bloc),
            )),
          ],
        )
      ]),
    );
  }

  Widget emailField(Bloc bloc) {
    return StreamBuilder(
      stream: bloc.email,
      builder: (context, AsyncSnapshot <String> snapshot){
        return TextField(
          onChanged: (valorQuePodeSerQualquerOutroNome){
            bloc.changeEmail(valorQuePodeSerQualquerOutroNome);
          },
          keyboardType: TextInputType.emailAddress,
          decoration: InputDecoration(
            hintText: 'seuemail@email.com', 
            labelText: 'Digite seu email',
            errorText: snapshot.hasError ? snapshot.error.toString() : null
          )
        );
      }
    );
  }

  Widget passwordField(Bloc bloc) {
    return TextField(
        keyboardType: TextInputType.emailAddress,
        decoration: InputDecoration(hintText: 'Senha', labelText: 'Senha'));
  }

  Widget submitButton(Bloc bloc) {
    return ElevatedButton(
        onPressed: (){},
        child: Text('OK'
        )
    );
  }
}
