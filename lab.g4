grammar lab;
start:((WS? if_codition+ WS? else_if* else*)?WS* (for_loop)?WS* var? WS* (switch)? WS* (do_while) WS*)*;
do_while: (WS*'do' WS* Open_brices WS* ( WS*if_codition | WS* switch| WS*var| WS*print| WS*for_loop)* WS* Close_brices  WS*)? While  WS*Open_brices_soft WS*(condition)+ WS*Close_brices_soft WS* ((Semicolom WS*)|( WS* Open_brices WS*(
( WS*if_codition | WS* switch| WS*var| WS*print| WS*for_loop)* WS* Close_brices)|(WS*(( WS*if_codition | WS* switch| WS*var| WS*print| WS*for_loop)? WS*))));
switch:Switch WS* Open_brices_soft WS* (Id WS* Arthmatic_op? WS* Integer?)WS* Close_brices_soft WS* Open_brices WS*
((Case|Default) WS* (Id|Integer)* WS* Doublecot WS* Open_brices?  WS*  (for_loop? if_codition? var? switch? print?) WS* Close_brices? Break? WS* Semicolom WS*)*
WS* Close_brices;
print:Print Open_brices_soft  WS* '"' (Id|Integer)* '"' WS* Close_brices_soft WS* Semicolom;
if_codition:IF (WS)? Open_brices_soft WS? condition WS? Close_brices_soft WS? Open_brices WS? ((var WS?)|(if_codition else_if* else*))+ WS? Close_brices;
else_if:Else WS? if_codition;
else:Else WS? Open_brices WS? ((var WS?)*) Close_brices;
var:(WS? Type? WS? Id WS? Equal? WS? '"'? WS? (Integer|Id)?  WS? '"'? WS? Semicolom);
expression: ((Id|Integer) WS* (Arthmatic_op | Conditaionl_op | Logical_op) Ws* (Id|Integer) N_Line*)+;
condition:( WS*(WS?(Id|Integer|expression) WS* (WS* Arthmatic_op WS? Id? WS?)? WS? (Conditaionl_op|Logical_op) WS? (Integer|Id|expression)? WS?)+)|True|False;
for_loop:For WS? Open_brices_soft WS? (WS? var WS? Comma?WS?)* Semicolom?  WS? condition? WS? Semicolom  WS? ((WS? Id( WS? Arthmatic_op WS?|WS? Arthmatic_op WS? Equal WS? Integer)) WS? Comma?WS?)* WS? Close_brices_soft
 WS? Open_brices WS?(for_loop|var*|if_codition)? WS? Close_brices
;
True:'true';
False:'false';
While:'while';
Print:'print';
Default:'default';
Case:'case';
Doublecot:(':'|'"');
Break:'break';
Switch:'switch';
For:'for';
Comma:',';
Type:('int'|'double'|'long'|'float'|'String'|'char'|'boolean');
WS:(' '|'\t'|'\r'|'\n')+{skip();};
IF:'if';
Else:'else';
Id:('a'..'z'|'A'..'Z'|'$'|'_')+('0'..'9'|'a'..'z'|'A'..'Z'|'$'|'_')*;
Integer:(('0'..'9')+|(('0'..'9')*('.')('0'..'9')+))|('true'|'false');
Char: 'a'..'z'|'A'..'Z';
Semicolom:';';
Equal:'=';
Arthmatic_op:('='|'+'|'++'|'--'|'-'|'/'|'*'|'%'|'^');
Conditaionl_op:('=='|'!='|'>'|'<'|'>='|'<=');
Logical_op:('&&'|'||'|'^');
N_Line:'\n'+{skip();};
Open_brices:'{';
Close_brices:'}';
Open_brices_soft:'(';
Close_brices_soft:')';
Cont:'continue'Semicolom;
