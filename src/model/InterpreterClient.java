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
public class InterpreterClient {

    private InterpreterEngine interpreterEngine;

    public InterpreterClient(InterpreterEngine interpreterEngine) {
        this.interpreterEngine = interpreterEngine;
    }

    public String interpret(String inputData) {

        Expression expression = null;

        if (inputData.contains("DD-MM-YYYY")) {
            expression = new DDMMYYYYDateExpression(inputData);
        } else if (inputData.contains("MM-DD-YYYY")) {
            expression = new MMDDYYYYDateExpression(inputData);
        } else if (inputData.contains("YYYY-MM-DD")) {
            expression = new YYYYMMDDDateExpression(inputData);
        } else {
            throw new RuntimeException(inputData + " is not valid Expression!!");
        }
        String result = expression.interpret(interpreterEngine);

        return result;
    }
}
