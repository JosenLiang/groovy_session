package com.thoughtworks.groovy

import groovy.transform.TupleConstructor
import org.codehaus.groovy.ast.ClassCodeVisitorSupport
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.expr.Expression
import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.control.SourceUnit

@TupleConstructor(includes = "sourceUnit")
class ExpressionVisitor extends ClassCodeVisitorSupport {
    final SourceUnit sourceUnit
    Expression selectStatement, fromStatement, whereStatement
    boolean isStartCompilation = false

    private void setIsStartCompilation(isStartCompilation) {
        throw new IllegalAccessException("you're not allowed to change isStartCompilation")
    }

    @Override
    void visitMethodCallExpression(MethodCallExpression call) {
        if (isCallingMethod(call, 'compile')) {
            isStartCompilation = true
            super.visitMethodCallExpression(call)
            isStartCompilation = false
        } else if (isCallingMethodAfterStartCompilation(call, 'select')) {
            selectStatement = call.arguments.expressions[0]
        } else if (isCallingMethodAfterStartCompilation(call, 'from')) {
            fromStatement = new ConstantExpression(call.arguments.expressions[0].text.split('\\.')[-1])
        } else if (isCallingMethodAfterStartCompilation(call, 'where')) {

        } else {
            super.visitMethodCallExpression(call)
        }
    }

    private isCallingMethodAfterStartCompilation(MethodCallExpression callExpression, String methodName) {
        isCallingMethod(callExpression, methodName) && isStartCompilation
    }

    private isCallingMethod(MethodCallExpression callExpression, String methodName) {
        methodName.equalsIgnoreCase(callExpression.methodAsString)
    }
}
