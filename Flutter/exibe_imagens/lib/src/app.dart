import "package:flutter/material.dart";

class App extends StatelessWidget {
  @override
   Widget build(BuildContext parametro) {
     return MaterialApp(
         home: Scaffold(
             appBar: AppBar(
               title: const Text("Minhas imagens"),
             ),
             floatingActionButton: FloatingActionButton(
                 onPressed: () => {
                   print("Estou no arquivo app.dart")
                 },
                 child: Icon(Icons.add))
         )
     );
   }
}