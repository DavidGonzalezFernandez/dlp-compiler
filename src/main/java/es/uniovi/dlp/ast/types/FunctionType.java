package es.uniovi.dlp.ast.types;

public class FuncType extends Type {
    public Object params; //TODO clase VarDefinition
    public Type returnType;

    public FuncType(int line, int column) {
        super(line, column);
    }

}
