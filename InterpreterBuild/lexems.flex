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


variable_name     = [A-Za-z_][A-Za-z_0-9]*



%%

<YYINITIAL> {
	";"	{return symbol(sym.SEMI);}
	"("	{return symbol(sym.LPARAN);}
	")"	{return symbol(sym.RPARAN);}
	"{"	{return symbol(sym.LBRAC);}
	"}"	{return symbol(sym.RBRAC);}
	","	{return symbol(sym.COMMA);}
	
	{dec_int}      {return symbol(sym.NUMBER, Integer.valueOf(yytext())); }

	{variable_name}       {return symbol(sym.VAR, yytext());}
	
	{dec_bool}	{ return symbol(sym.BOOL, Boolean.valueOf(yytext())); }

	{dec_direction}	{return symbol(sym.DIRECTION, yytext());}
	{dec_dirtiness}	{return symbol(sym.DIRTINESS, yytext());}
	{dec_obstacle}	{return symbol(sym.OBSTACLE, yytext());}
	{dec_location}	{return symbol(sym.LOCATION, yytext());}
	"STEP"	{return symbol(sym.STEP);}


	{WhiteSpace}       { /* just skip what was found, do nothing */ }
}

[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
