package es.uniovi.dlp.ast.statement.substatements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.statement.AbstractStatement;
import es.uniovi.dlp.ast.statement.Statement;

import java.util.List;

public class While extends AbstractStatement {
    private Expression condition;
    private List<Statement> body;
    public While(int line, int column) {
        super(line, column);
    }
}
