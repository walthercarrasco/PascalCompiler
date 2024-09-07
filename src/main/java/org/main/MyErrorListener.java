package org.main;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class MyErrorListener extends org.antlr.v4.runtime.BaseErrorListener {

    public static ArrayList<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String errorMessage = "Error de sintaxis en la línea " + line + ", columna " + charPositionInLine + ": " + msg;
        errorMessage = errorMessage.replace("no viable alternative at input", "ninguna alternativa viable en la entrada");
        errorMessage = errorMessage.replace("token recognition error at:","error de reconocimiento de token en:");
        errorMessage = errorMessage.replace("extraneous input","entrada ajena");
        errorMessage = errorMessage.replace("expecting","se esperaba");
        errorMessage = errorMessage.replace("missing","falta");
        errorMessage = errorMessage.replace("mismatched input","entrada incorrecta");
        errorMessage = errorMessage.replace("at","en");
        System.err.println(errorMessage);
        underlineError(recognizer,(Token)offendingSymbol,
                line, charPositionInLine);
    }

    protected void underlineError(Recognizer recognizer,
                                  Token offendingToken, int line,
                                  int charPositionInLine) {
        CommonTokenStream tokens =
                (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if ( start>=0 && stop>=0 ) {
            for (int i=start; i<=stop; i++) System.err.print("^");
        }
    }
}
