package es.uniovi.dlp.ast.types.subtypes;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.AbstractType;

import java.lang.reflect.Type;

public class StructField extends AbstractType {
    private String name;
    private Type type;
    public StructField(int line, int column) {
        super(line, column);
    }
}
