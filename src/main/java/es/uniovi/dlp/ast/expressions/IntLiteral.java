package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.Type;

public class IntLiteral extends AbstractASTNode implements Expression {
    public IntLiteral(int line, int column) {
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
