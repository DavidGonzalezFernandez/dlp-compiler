package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.statement.ReadStatement;
import es.uniovi.dlp.ast.types.CompilerType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<CompilerType, CompilerType> {
    public void visit(Assignment a, Object param) {

    }

    public void visit(ReadStatement r, Object param) {

    }

}
