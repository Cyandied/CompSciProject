JFLEX		= ~/sys/jflex-1.9.1/bin/jflex
CUPJAR		= ~/sys/java-cup-11b.jar
CUPJAR_RUNTIME	= java-cup-11b-runtime.jar
CUP		= java -jar $(CUPJAR)

LEXER_IN	= lcalc.flex
PARSER_IN	= 

all: Main.class

Main.class: Main.java Lexer.java sym.java parser.java
	javac -Xlint:deprecation -cp $(CUPJAR) *.java

Lexer.java: lcalc.flex
	$(JFLEX) $<

parser.java sym.java: ycalc.cup
	$(CUP) -interface < $<

run: in.txt Main.class
	java -cp $(CUPJAR_RUNTIME):. Main in.txt

clean:
	rm -rf *.class Lexer.java parser.java sym.java
