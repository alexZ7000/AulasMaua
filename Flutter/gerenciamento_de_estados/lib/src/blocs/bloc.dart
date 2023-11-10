import 'dart:async';
import 'package:email_validator/email_validator.dart';
import 'validators.dart';
import 'dart:async';

class Bloc with Validators {
  final _emailStreamController = StreamController<String>();
  final _passwordStreamController = StreamController<String>();

  Function(String) get changeEmail => _emailStreamController.sink.add;
  Function(String) get changePassword => _passwordStreamController.sink.add;

  Stream<String> get email => _emailStreamController.stream.transform(validadeEmail);
  Stream<String> get password => _passwordStreamController.stream.transform(validatePassword);
}

final bloc = Bloc();
