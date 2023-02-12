package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.program.VarDefinition;

import java.util.List;

public class FunctionType extends AbstractType {
    public List<VarDefinition> params;
    public Type returnType;

    public FunctionType(int line, int column) {
        super(line, column);
    }

}
