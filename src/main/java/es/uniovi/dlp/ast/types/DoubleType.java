package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

import java.lang.reflect.Type;

public class DoubleType extends AbstractASTNode implements Type {
    public DoubleType(int line, int column) {
        super(line, column);
    }
}
