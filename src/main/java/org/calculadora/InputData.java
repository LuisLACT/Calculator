package org.calculadora;

import java.util.Scanner;

import static org.calculadora.Validation.validateNum;
import static org.calculadora.Validation.validateOp;

public class InputData {

    Scanner scanner;

    public InputData() {
        this.scanner = new Scanner(System.in);
    }

    public double inputNum(int x){
        String numTemp;
        double num;

        do{
            try {

                System.out.print("Operando " + x + ": ");
                numTemp = this.scanner.nextLine();
                num = validateNum(numTemp);
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (true);

        return num;
    }


    public String inputOp(){
        String op;

        do{
            try {

                System.out.print("Operador (+ - * /): ");
                op = this.scanner.nextLine();
                validateOp(op);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        return op;
    }

    public boolean repeat(){

        System.out.print("Quieres continuar?: SI = 1, NO = Cualquier otra tecla: ");
        String con = this.scanner.nextLine();
        return con.equals("1");
    }
}
