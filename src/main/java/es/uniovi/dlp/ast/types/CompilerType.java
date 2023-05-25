package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import java.util.List;

public interface CompilerType extends ASTNode {
  public CompilerType arithmetic(CompilerType other);

  public CompilerType logical(CompilerType other);

  public CompilerType indexing(CompilerType other);

  public CompilerType dot(String other);

  public CompilerType cast(CompilerType other);

  public CompilerType comparison(CompilerType other);

  public CompilerType invocation(List<Expression> arguments);

  public int getNumberOfBytes();

  public boolean isIndexable();

  public boolean isArray();

  public boolean allowsDot();

  public boolean isSimpleType();

  public boolean isArithmetic();

  public boolean isError();

  public boolean isLogical();

  public boolean isCallable();

  public boolean canPromoteTo(CompilerType other);

  public CompilerType getIntermediateType(CompilerType toType);
}
