package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.Type;

public class IntLiteral extends AbstractASTNode implements Expression {
    private int value;
    private Type type;
    public IntLiteral(int line, int column) {
        super(line, column);
        this.type = (Type) new IntType(line, column);   //FIXME: eliminar el cast
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
