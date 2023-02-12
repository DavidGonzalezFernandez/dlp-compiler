package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.ast.types.Type;

public class DoubleLiteral extends AbstractASTNode implements Expression {
    private double value;
    private Type type;
    public DoubleLiteral(int line, int column) {
        super(line, column);
        this.type = (Type) new DoubleType(line, column);        // FIXME: elimianr el cast
    }

    public void setChar(char value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}
