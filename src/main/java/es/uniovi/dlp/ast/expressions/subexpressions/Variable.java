package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.types.Type;

public class Variable extends AbstractExpression {
    private String name;
    private VarDefinition definition;
    public Variable(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public Object getValue() {
        return null;
    }
}
