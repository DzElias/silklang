
/*
 * Copyright (c) under GPL V3. Read LICENSE located in the root of the project.
 * All rights reserved.
 */

package silklang.Expressions.representations;

import silklang.Expressions.base.Visitor;
import silklang.Expressions.base.Expr;
import silklang.Lexer.Token;

public class Super extends Expr {
    private Token keyword;
    private Token method;

    public Super(Token keyword, Token method) {
        this.keyword = keyword;
        this.method = method;
    }

    public Token getKeyword() {
        return keyword;
    }

    public void setKeyword(Token keyword) {
        this.keyword = keyword;
    }

    public Token getMethod() {
        return method;
    }

    public void setMethod(Token method) {
        this.method = method;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitSuperExpr(this);
    }
}
