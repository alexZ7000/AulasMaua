import 'package:flutter/material.dart';
import 'bloc.dart';

// Aqui centralizamos o estado da aplicação
// Isso significa que as classes que herdam começam a ser Stateless
// Isso significa que os Widgets serão completamente re-desenhados
// Mas com isso conseguimos passar mudanças de estados para mais de um Widget
class Provider extends InheritedWidget{
  final bloc = Bloc();

  Provider({super.key, required super.child});
  //Provider(Key ? key, required Widget child) : super(key: key, child: child);

  // Se o flutter deveria notificar os widgets que herdam desse widget
  // Notificação significa mandar uma notificação a respeito das classes que herdam para se atualizar
  // Covariancia (covariant) permite que um tipo diferente (que ainda seja correspondente a superclasse) seja passado
  @override
  bool updateShouldNotify(covariant InheritedWidget oldWidget) => true;

  static Bloc of(BuildContext context){
    return context.dependOnInheritedWidgetOfExactType<Provider>()!.bloc;
  }
}