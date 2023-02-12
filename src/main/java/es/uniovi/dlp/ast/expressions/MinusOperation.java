package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public class MinusOperation extends AbstractASTNode implements Expression {
    private Expression expression;
    public MinusOperation(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return null;
    }   //TODO: pendiente de implementar

    @Override
    public Object getValue() {
        return null;
    }   //TODO: pendiente de implementar
}
