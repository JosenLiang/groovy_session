package com.thoughtworks.groovy

import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

import static org.codehaus.groovy.control.CompilePhase.SEMANTIC_ANALYSIS

@GroovyASTTransformation(phase = SEMANTIC_ANALYSIS)
class QueryableTransformation implements ASTTransformation {
    @Override
    void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {
        sourceUnit.ast.classes.each {
            it.visitContents(new ExpressionVisitor(sourceUnit))
        }
    }
}
