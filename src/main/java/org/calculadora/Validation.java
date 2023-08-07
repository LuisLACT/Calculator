package org.calculadora;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static String round(double x){
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(x);
    }

    public static double validateNum(String numTemp) throws Exception{
        double num = isNum(numTemp);

        Pattern pattern = Pattern.compile("\\d+\\.\\d{1}");
        Matcher matcher = pattern.matcher(numTemp);

        if (!matcher.matches()) {
            throw new Exception("Número no cumple con el formato");
        }

        return num;
    }

    private static double isNum(String numTemp) throws Exception {
        double num;
        try {
            num = Double.parseDouble(numTemp);
        }catch (Exception e){
            throw new Exception("No es un numero");
        }
        return num;
    }

    public static void validateOp(String op) throws Exception{
        String[] opAllowed = {"+", "-", "*", "/"};
        boolean valid = false;
        for (String element : opAllowed) {
            if (element.equals(op)) {
                valid = true;
                break;
            }
        }
        if (!valid){
            throw new Exception("Operador invalido");
        }
    }
}
