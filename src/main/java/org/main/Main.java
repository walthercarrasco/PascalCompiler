package org.main;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;


public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        MiniPascalLexer lexer = new MiniPascalLexer(new org.antlr.v4.runtime.ANTLRInputStream("program ciclos;\n" +
                "{declaramos las variables}\n" +
                "var lenght,i,j,x,y,cont:Integer;\n" +
                " arreglo:Array[1..50] of Integer;\n" +
                " arreglo_bidi: Array[1..10,1..5] of Integer;\n" +
                "s:String;\n" +
                "Function f():Integer;\n" +
                "Begin \n" +
                "f := 3; \n" +
                "end;\n" +
                "begin \n" +
                "{iniciamos las variables}\n" +
                "lenght := 50;\n" +
                "x := 10;\n" +
                "y := 5;\n" +
                "cont := 1;\n" +
                "{llenamos el arreglo bidimensional}\n" +
                "For i := x Downto 1 Do\n" +
                "Begin\n" +
                "For j := y Downto 1 Do\n" +
                "arreglo_bidi[i,j] := ( cont + ( x - y ) + 5) mod 15;\n" +
                "End;\n" +
                "{reiniciamos el contador}\n" +
                "cont := 1;\n" +
                "{llenamos el arreglo unidimensional}\n" +
                "For i := 1 To x Do\n" +
                "For j := 1 To y Do\n" +
                "Begin\n" +
                "arreglo[cont] := arreglo_bidi[i,j];\n" +
                "cont := ( cont + 1 ) ;\n" +
                "End;\n" +
                "{reiniciamos el contador}\n" +
                "cont := 1;\n" +
                "{imprimimos el arreglo unidimensional}\n" +
                "While ( cont <> lenght+1 ) Do\n" +
                "Begin\n" +
                "write('arreglo[%d] = ',cont);\n" +
                "writeln('%d',arreglo[cont]); \n" +
                "End; \n" +
                "writeln('Gracias por usar Pascal!');\n" +
                "end_"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniPascalParser parser = new MiniPascalParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener());
        ParseTree tree = parser.program_block();
        MyVisitor visitor = new MyVisitor();
        String str = visitor.visit(tree);
        System.out.println(ANSI_RESET + str);
    }
}