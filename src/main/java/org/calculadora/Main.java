package org.calculadora;


import static org.calculadora.Arithmetic.resolve;

public class Main {
    public static void main(String[] args) {
        boolean con = true;
        double num1, num2;
        String op, result;
        InputData io = new InputData();


        while (con){
            System.out.println("El formato para los numeros es: numeros.UnSoloDecimal, ejemplo: 12.3, 1.0");
            num1 = io.inputNum(1);
            op = io.inputOp();
            num2 = io.inputNum(2);

            try {
                result = resolve(num1, op, num2);
                System.out.println("Resultado: " + num1 + " " + op + " " + num2 + " = " + result);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            con = io.repeat();
        }

    }

}