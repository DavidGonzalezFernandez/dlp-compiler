package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.AbstractASTNode;
public abstract class AbstractStatement extends AbstractASTNode implements Statement {
    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}
