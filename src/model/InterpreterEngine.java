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
public class InterpreterEngine {

    public String mmDDyyyyDateFormat(String inputData) {
        String[] tokens = interpret(inputData);
        String year = tokens[0];
        String month = tokens[1];
        String date = tokens[2]; 
        return month + "-" + date + "-"+ year;
    }
    
    public String ddMMyyyyDateFormat(String inputData) {
        String[] tokens = interpret(inputData);
        String year = tokens[0];
        String month = tokens[1];
        String date = tokens[2];
        return date + "-" + month +"-" +year;
    }

    public String yyyyMMddDateFormat(String inputData) {
        String[] tokens = interpret(inputData);
        String year = tokens[0];
        String month = tokens[1];
        String date = tokens[2];
        return year + "-" + month + "-" +date;
    }

    private String[] interpret(String inputData) {
        String[] values = inputData.split(" ");
        return values[0].split("-", 3);
    }
}
