package es.uniovi.dlp.ast.statement.substatements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statement.AbstractStatement;
import es.uniovi.dlp.ast.statement.Statement;

public class Assignment extends AbstractStatement {
    private Expression leftPart;
    private Expression value;
    public Assignment(int line, int column) {
        super(line, column);
    }
}
