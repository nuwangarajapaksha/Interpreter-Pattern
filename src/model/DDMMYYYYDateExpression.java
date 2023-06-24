/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUWAA
 */
public class DDMMYYYYDateExpression implements Expression{
    
    private String expression;

    public DDMMYYYYDateExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.ddMMyyyyDateFormat(expression);
    }
    
}
