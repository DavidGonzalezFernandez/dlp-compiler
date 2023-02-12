package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.Type;

public class CharLiteral extends AbstractASTNode implements Expression {
    private char value;
    private Type type;
    public CharLiteral(int line, int column) {
        super(line, column);
        this.type = (Type) new CharType(line, column);  // FIXME: elimianr el cast
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}
