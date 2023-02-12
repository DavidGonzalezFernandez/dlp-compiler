package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;

public class ReadStatement extends AbstractASTNode implements Statement {
    private Expression expression;
    public ReadStatement(int line, int column) {
        super(line, column);
    }
}
