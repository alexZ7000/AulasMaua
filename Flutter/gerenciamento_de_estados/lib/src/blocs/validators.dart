import 'dart:async';


mixin class Validators {
  final validadeEmail = StreamTransformer<String, String>.fromHandlers(
    handleData: (data, sink) {},
  );
}
