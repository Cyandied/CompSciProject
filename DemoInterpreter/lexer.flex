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

variable_name = [A-Za-z_][A-Za-z_0-9]*

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
		
/* Variable declaration, structured like: store value as name; */
	"store"			{return symbol(sym.STORE);}
	"as"			{return symbol(sym.AS);}		

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

/* While loop equivalent, structured like: think (logic) {program;} */
	"think"			{return symbol(sym.THINK);}
	"about"			{return symbol(sym.ABOUT);}

/* to not confuse any tokens as variables */
	{variable_name}	{return symbol(sym.VAR, yytext());}

/* Whitespace */
	{WhiteSpace}	{/* just skip what was found, do nothing */}
}

[^]                    {throw new Error("Illegal character <"+yytext()+"> at column: " + yycolumn + " line: " + yyline);}
