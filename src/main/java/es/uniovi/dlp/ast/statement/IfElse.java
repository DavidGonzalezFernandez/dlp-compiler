package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class IfElse extends AbstractASTNode implements Statement {
    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;
    public IfElse(int line, int column) {
        super(line, column);
    }
}
