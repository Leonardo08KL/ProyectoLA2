package Compilador;
import static Compilador.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "endl" | "\n" ) {return Linea;}

/* Marcador de inicio de algoritmo */
( "inicio" | "main" ) {lexeme=yytext(); return Main;}

/* Marcador de fin de algoritmo */
( "fin" | "end" ) {lexeme=yytext(); return End;}

/* Tipos de datos */
int |
double |
float |
char |
string |
entero |
doble |
flotante |
caracter |
cadena {lexeme=yytext(); return T_datos;}

/* Estructuras de control */
si |
if |
else |
sino |
encaso |
case |
switch |
elegir {lexeme=yytext(); return Estructuras_control;}

/* Estructuras de iteracion */
do |
hacer |
while |
mientras |
for |
para {lexeme=yytext(); return Estructuras_iteracion;}

/* Funcion escribir */
cout |
escribir {lexeme=yytext(); return Escribir;}

/* Funcion leer */
cin |
leer {lexeme=yytext(); return Leer;}

/* Comillas */
\" {lexeme=yytext(); return Comillas;}

/* Dos puntos */
( ":" ) {lexeme=yytext(); return D_puntos;}

/* Operador Igual */
( ":=" | "=" ) {lexeme=yytext(); return Igual;}

/* Operador Diferente */
( "!=" ) {lexeme=yytext(); return Diferente;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operador Punto */
( "." ) {lexeme=yytext(); return Punto;}

/* Operador Salida*/
( "<<" ) {lexeme=yytext(); return Salida;}

/* Operador Division */
( ">>" ) {lexeme=yytext(); return Entrada;}

/* Operador Mod */
( "%" ) {lexeme=yytext(); return Mod;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme=yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme=yytext(); return Corchete_c;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Libreria */
( "#include<iostream>" ) {lexeme=yytext(); return Librerias;}   

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}
