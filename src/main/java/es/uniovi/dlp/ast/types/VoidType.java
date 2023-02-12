package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

import java.lang.reflect.Type;

public class VoidType extends AbstractASTNode implements Type {
    public VoidType(int line, int column) {
        super(line, column);
    }
}
