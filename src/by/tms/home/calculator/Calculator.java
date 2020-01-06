package by.tms.home.calculator;

import java.io.IOException;

public class Calculator implements ICalculator {

//    private String op_sum = "+";
//    private String op_sub = "-";
//    private String op_mul = "*";
//    private String op_div = "/";

    private double sum(double a, double b) {
        return a + b;
    }

    private double substract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double division(double a, double b) {
        return a / b;
    }

    public double calc(double a, double b, String op) throws IOException {
        switch (op) {
            case "+":
                return sum(a, b);
            case "-":
                return substract(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return division(a, b);
            default:
                throw new IOException("error");
        }
    }

    public boolean is_validate_op(String op) {
        switch (op) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }
}
