package org.calculadora;

import static org.calculadora.Validation.round;

public class  Arithmetic {

    public static String resolve(double x, String op, double y) throws Exception{
        double result = 0;
        switch (op) {
            case "+" -> result = x + y;
            case "-" -> result = x - y;
            case "*" -> result = x * y;
            case "/" -> {
                if (y == 0) {
                    throw new Exception("Operacion incorrecta, division entre cero");
                }
                result = x / y;
            }
        }
        return round(result);
    }
}
