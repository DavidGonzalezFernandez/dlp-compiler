package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

import java.lang.reflect.Type;

public class CharType extends AbstractASTNode implements Type {
    public CharType(int line, int column) {
        super(line, column);
    }
}
