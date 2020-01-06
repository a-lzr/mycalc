package by.tms.home.calculator;

import java.io.IOException;

public interface ICalculator {
    boolean is_validate_op(String op);
    double calc(double a, double b, String op) throws IOException;
}
