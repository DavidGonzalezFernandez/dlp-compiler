package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class While extends AbstractASTNode implements Statement {
    private Expression condition;
    private List<Statement> body;
    public While(int line, int column) {
        super(line, column);
    }
}
