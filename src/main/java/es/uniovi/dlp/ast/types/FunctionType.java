package es.uniovi.dlp.ast.types;

public class FunctionType extends AbstractType {
    public Object params; //TODO clase VarDefinition
    public Type returnType;

    public FunctionType(int line, int column) {
        super(line, column);
    }

}
