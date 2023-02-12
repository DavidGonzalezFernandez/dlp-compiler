package es.uniovi.dlp.ast.statement.substatements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statement.AbstractStatement;
import es.uniovi.dlp.ast.statement.Statement;

import java.util.List;

public class IfElse extends AbstractStatement {
    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;
    public IfElse(int line, int column) {
        super(line, column);
    }
}
