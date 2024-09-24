package org.main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.Comparator;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.JFileChooser;
import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        String input = "";
        File fichero = null;
        try {
            JFileChooser filechooser = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
            filechooser.setFileFilter(filtro);
            int seleccion = filechooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = filechooser.getSelectedFile();
                input = fichero.getAbsolutePath();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        CharStream charStream = null;
        try{
            charStream = fromFileName(input);
        }catch (Exception e){
            System.err.println("No se ha seleccionado un archivo");
            System.exit(1);
        }

        MiniPascalLexer lexer = new MiniPascalLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MyErrorListener(true));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniPascalParser parser = new MiniPascalParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener(false));
        ParseTree tree = parser.program_block();
        MyErrorListener.errors.sort(Comparator.comparingInt(MyErrorListener.MyError::line));
        MyErrorListener.errors.forEach(error -> {
            System.err.println(error.errorMsg());
        });
        MyVisitor visitor = new MyVisitor();
        String str = visitor.visit(tree);
        //System.out.println(str);
    }
}