package es.uniovi.dlp.ast.types;

public class FunctionType extends Type {
    public Object params; //TODO clase VarDefinition
    public Type returnType;

    public FunctionType(int line, int column) {
        super(line, column);
    }

}
