package es.uniovi.dlp.ast.types.subtypes;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.AbstractType;

import java.lang.reflect.Type;

public class ArrayType extends AbstractType {
    private int size;
    private Type type;

    public ArrayType(int line, int column) {
        super(line, column);
    }
}
