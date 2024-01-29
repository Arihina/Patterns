package Interpreter;

import java.util.regex.Pattern;

public class NumsDeleter implements Expression {
    @Override
    public String interpret(ContextExpr context) {
        String[] newContext = Pattern.compile("[0-9]").split(context.context);
        String result = String.join("", newContext);
        return result;
    }
}
