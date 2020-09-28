package com.example.basiccalculator;

public class SimpleExpression {
    public Integer operand1;
    public Integer operand2;
    public String operator;

    public SimpleExpression(){
        operand1 = 0;
        operand2 = 0;
        operator = "+";
    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getValue(){
        Integer value = 0;
        switch(operator){
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "x":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "%":
                return operand1 % operand2;
            case "x^2":
                return (int) Math.pow(operand1, operand2);
        }
        return value;
    }
    public void clearOperands(){
        operand1 = 0;
        operand2 = 0;
    }
}
