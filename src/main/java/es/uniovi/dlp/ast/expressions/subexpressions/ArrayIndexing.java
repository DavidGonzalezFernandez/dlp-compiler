package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.Type;

public class ArrayIndexing extends AbstractExpression {
    private Expression array;
    private Expression index;

    public ArrayIndexing(int line, int column) {
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
