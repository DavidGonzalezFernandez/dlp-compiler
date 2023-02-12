package es.uniovi.dlp.ast.expressions.subexpressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.AbstractExpression;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.subtypes.IntType;
import es.uniovi.dlp.ast.types.Type;

public class IntLiteral extends AbstractExpression {
    private int value;
    private Type type;
    public IntLiteral(int line, int column) {
        super(line, column);
        this.type = new IntType(line, column);
    }

    @Override
    public Type getType() {
        return this.type;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}
