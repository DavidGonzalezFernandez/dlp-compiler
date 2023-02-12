package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

import java.lang.reflect.Type;

public class ArrayType extends AbstractASTNode implements Type {
    private int size;
    private Type type;

    public ArrayType(int line, int column) {
        super(line, column);
    }
}
