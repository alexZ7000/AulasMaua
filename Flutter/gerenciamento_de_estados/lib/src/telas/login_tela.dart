import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class LoginTela extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      margin: EdgeInsets.all(20.0),
      child: Column(children: [
        emailField(),
        passwordField(),
        Row(
          children: [
            Expanded(
              child: Container(
                margin: EdgeInsets.only(top: 12.0),
                child: submitButton(),
            )),
          ],
        )
      ]),
    );
  }

  Widget emailField() {
    return StreamBuilder(
      stream: bloc.email,
      builder: (context, AsyncSnapshot <String> snapshot){
        return TextField(
          onChanged: (valorQuePodeSerQualquerOutroNome){
            bloc.changeEmail(valor);
          },
          keyboardType: TextInputType.emailAddress,
          decoration: InputDecoration(
            hintText: 'seuemail@email.com', 
            labelText: 'Digite seu email',
            errorText: snapshot.hasError ? snapshot.error.toString() : null;
          )
        );
      }
    );

    
  }
  //TODO: flutter pub add email_validator

  Widget passwordField() {
    return TextField(
        keyboardType: TextInputType.emailAddress,
        decoration: InputDecoration(hintText: 'Senha', labelText: 'Senha'));
  }

  Widget submitButton() {
    return ElevatedButton(onPressed: null, child: Text('OK'));
  }
}
