import 'package:flutter/material.dart';
import './telas/login_tela.dart';

class App extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'login',
      home: Scaffold(body: LoginTela(),),
    );
  }
}
