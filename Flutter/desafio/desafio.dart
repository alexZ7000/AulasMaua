import 'dart:math';
import 'dart:io';

void main() {
  int computerValue = 10;
  print("Escolha um valor de 0 a 100: ");
  String? userInput = stdin.readLineSync();
  int userValue = int.parse(userInput!);
  if (userValue != computerValue) {
    while (userValue != computerValue) {
      if (computerValue == userValue)
        break;
      else {
        if (computerValue > userValue) {
          print("O valor secreto é maior");
          print("\nEscolha um valor de 0 a 100: ");
          userInput = stdin.readLineSync();
          userValue = int.parse(userInput!);
        } else if (computerValue < userValue) {
          print("O valor secreto é menor");
          print("\nEscolha um valor de 0 a 100: ");
          userInput = stdin.readLineSync();
          userValue = int.parse(userInput!);
        }
      }
    }
  }
  print("Você venceu");
}