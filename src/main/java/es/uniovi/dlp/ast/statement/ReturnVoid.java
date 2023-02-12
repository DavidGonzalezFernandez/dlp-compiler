package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.AbstractASTNode;

public class ReturnVoid extends AbstractASTNode implements Statement {
    public ReturnVoid(int line, int column) {
        super(line, column);
    }
}
