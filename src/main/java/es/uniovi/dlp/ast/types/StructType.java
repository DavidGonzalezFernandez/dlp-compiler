package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

import java.lang.reflect.Type;
import java.util.List;

public class StructType extends AbstractASTNode implements Type  {
    private List<StructField> fields;
    public StructType(int line, int column) {
        super(line, column);
    }
}
