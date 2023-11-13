import 'package:flutter/material.dart';
import 'package:gerenciamento_de_estados/src/blocs/provider.dart';
import './telas/login_tela.dart';

class App extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Provider(
        child: MaterialApp(
          title: 'login',
          home: Scaffold(
            body: LoginTela()
          )
        )
    );
  }
}
