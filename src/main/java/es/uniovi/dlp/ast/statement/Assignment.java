package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;

public class Assignment extends AbstractASTNode implements Statement {
    private Expression leftPart;
    private Expression value;
    public Assignment(int line, int column) {
        super(line, column);
    }
}
