import 'dart:io';
import 'dart:math';
import 'package:equations/equations.dart';

void main() {
  // 1. Área de círculo
  print('Digite o raio do cículo: ');
  String? input = stdin.readLineSync();
  double valorDecimal = double.parse(input!);
  print(pi * (valorDecimal * valorDecimal));

  // 2. Baskhara
  final equation = Quadratic(
      a: Complex(2, -3),
      b: Complex.fromImaginaryFraction(Fraction(6, 5)),
      c: Complex(5, -1)
  );
  for (final root in equation.solutions()) {
    print(root);
  }


}