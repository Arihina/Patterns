package Interpreter;

import java.util.regex.Pattern;

public class CharsDeleter implements Expression {
    @Override
    public String interpret(ContextExpr context) {
        String[] newContext = Pattern.compile("[a-z, A-Z]").split(context.context);
        String result = String.join("", newContext);
        return result;
    }
}
