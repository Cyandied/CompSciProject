import java_cup.runtime.*;

%%

%class Lexer

%line
%column

%cup

%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]
dec_int    = 0 | [1-9][0-9]*
dec_bool = "FALSE" | "TRUE"

dec_direction = "LEFT" | "RIGHT" | "UP" | "DOWN" | "CURRENT"
dec_dirtiness = "CLEAN" | "MESSY" | "DIRTY" | "FILTHY" | "DISGUSTING"
dec_obsacle = "WALL" | "OBSTACLE"
dec_location = "CURRENT_LOC" | "START_LOC"

variable_routine_name = [A-Za-z_][A-Za-z_0-9]*

%%

<YYINITIAL> {

/* Symbols */

    "+"                { System.out.print(" + "); return symbol(sym.PLUS); }
    "-"                { System.out.print(" - "); return symbol(sym.MINUS); }
    "*"                { System.out.print(" * "); return symbol(sym.TIMES); }
    "/"                { System.out.print(" / "); return symbol(sym.DIVIDE); }

	";"				{return symbol(sym.SEMI);}
	"("				{return symbol(sym.LPARAN);}
	")"				{return symbol(sym.RPARAN);}
	"{"				{return symbol(sym.LBRAC);}
	"}"				{return symbol(sym.RBRAC);}
	","				{return symbol(sym.COMMA);}

	"end"			{return symbol(sym.END);}
	"about"			{return symbol(sym.ABOUT);}	

/* Variable declaration, structured like: store value as name; */
	"store"			{return symbol(sym.STORE);}
	"as"			{return symbol(sym.AS);}

/* Method declaration, structured like: new routine( args ) {program; return value;}; */
	"new"			{return symbol(sym.NEW);}
	"routine"		{return symbol(sym.ROUTINE);}
	"return"		{return symbol(sym.RETURN);}			

/* Boolean and int */	
	{dec_bool}		{return symbol(sym.BOOL, Boolean.valueOf(yytext()));}
	{dec_int}		{return symbol(sym.NUMBER, Integer.valueOf(yytext())); }

/* Logic parts */
	"GRT"			{return symbol(sym.GRT);}
	"LRT"			{return symbol(sym.LRT);}
	"EQL"			{return symbol(sym.EQL);}
	"NEQ"			{return symbol(sym.NEQ);}
	"AND"			{return symbol(sym.AND);}
	"OR"			{return symbol(sym.OR);}

/* If equivalent, structured like: if (logic) then {program;} else if (logic) then {program;} else {program;} */
	"if"			{return symbol(sym.IF);}
	"else"			{return symbol(sym.ELSE);}
	"then"			{return symbol(sym.THEN);}

/* Switch equivalent, structured like: switch (value) { (value 1) then {program;} (value 2) then {program;} } */
	"switch"		{return symbol(sym.SWITCH);}

/* While loop equivalent, structured like: think (logic) {program;} */
	"think"			{return symbol(sym.THINK);}

/* For loop equivalent, structured like: count (iterator EQL value FIND logic ELSE INC/DEC){program;} */
	"count"			{return symbol(sym.COUNT);}
	"FIND"			{return symbol(sym.FIND);}
	"INC"			{return symbol(sym.INC);}
	"DEC"			{return symbol(sym.DEC);}

/* to not confuse any tokens as variables */
	{variable_routine_name}	{return symbol(sym.VAR, yytext());}

/* Whitespace */
	{WhiteSpace}	{/* just skip what was found, do nothing */}
}

[^]                    {throw new Error("Illegal character <"+yytext()+"> at column: " + yycolumn + " line: " + yyline);}
