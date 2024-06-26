package Compilador;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "endl" | "\n" ) {return new Symbol(sym.Linea, yychar, yyline, yytext());}

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
cadena {return new Symbol(sym.T_datos, yychar, yyline, yytext());}

/* Estructuras de control */
si |
if |
else |
sino |
encaso |
case |
switch |
elegir {return new Symbol(sym.Estructuras_control, yychar, yyline, yytext());}

/* Estructuras de iteracion */
do |
hacer |
while |
mientras |
for |
para {return new Symbol(sym.Estructuras_iteracion, yychar, yyline, yytext());}

/* Funcion escribir */
cout |
escribir {return new Symbol(sym.Escribir, yychar, yyline, yytext());}

/* Funcion leer */
cin |
leer {return new Symbol(sym.Leer, yychar, yyline, yytext());}

/* Librerias */
( "#include<iostream>" ) {return new Symbol(sym.Librerias, yychar, yyline, yytext());}

/* Operador Punto */
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* Operador Salida*/
( "<<" ) {return new Symbol(sym.Salida, yychar, yyline, yytext());}

/* Operador Entrada */
( ">>" ) {return new Symbol(sym.Entrada, yychar, yyline, yytext());}

/* Comillas */
\" {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Dos puntos */
( ":" ) {return new Symbol(sym.D_puntos, yychar, yyline, yytext());}

/* Operador Diferente */
( "!=" ) {return new Symbol(sym.Diferente, yychar, yyline, yytext());}

/* Operador Igual */
( ":=" | "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operador Mod */
( "%" ) {return new Symbol(sym.Mod, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" | "inicio" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Marcador de fin de algoritmo */
( "end" | "fin" ) {return new Symbol(sym.End, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}