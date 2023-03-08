grammar lab;

var:((Type WS Id WS? Semicolom) | (WS? Type WS Id WS? Equal WS? (Integer|Id) WS? Semicolom) N_Line*)+;
expression: ((Id|Integer) WS* (Arthmatic_op | Conditaionl_op | Logical_op) Ws* (Id|Integer) N_Line*)+;
condition: ((Id|Integer|expression) WS* (Arthmatic_op WS? Id WS?)? Conditaionl_op WS* (Integer|Id|expression)? WS*)+;


if_codition:IF (WS)* Open_brices_soft WS* condition WS* Close_brices_soft WS* Open_brices (WS*|N_Line*) (var+|if_codition) (WS*|N_Line*) Close_brices;
else_if:Esle ' ' if_codition;
else:Open_brices  (var+|if_codition) Close_brices;


Type:('int'|'double'|'long'|'float'|'String'|'char'|'boolean');
WS:(' '|'\t'|'\r'|'\n');
IF:'if';
Else:'else';
Id:('a'..'z'|'A'..'Z'|'$'|'_')+('0'..'9'|'a'..'z'|'A'..'Z'|'$'|'_')*;
Integer:(('0'..'9')+|(('0'..'9')*('.')('0'..'9')+))|('true'|'false');
Char: 'a'..'z'|'A'..'Z';
Semicolom:';';
Equal:'=';
Arthmatic_op:('='|'+'|'++'|'--'|'-'|'/'|'*'|'%');
Conditaionl_op:('=='|'!='|'>'|'<'|'>='|'<=');
Logical_op:('&&'|'||');
N_Line:'\n';
Open_brices:'{';
Close_brices:'}';
Open_brices_soft:'(';
Close_brices_soft:')';

