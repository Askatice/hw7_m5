package com.askat.hw7_m5;

public class Math {

    public String divide(String number1, String number2) {
        String result = "";

        if (number1 != null && number2 != null) {
            if (number2.equals("0")) {
                result = "На ноль делить нельзя!";
            } else if (!isNumeric(number1) || !isNumeric(number2)) {
                result = "Буквы вводить нельзя!";
            } else if (number1.contains("-") || number2.contains("-")) {
                result = "Отрицательные числа нельзя!";
            } else {
                int num1 = Integer.parseInt(number1.trim());
                int num2 = Integer.parseInt(number2.trim());
                result = String.valueOf(num1 / num2);
            }
        } else {
            result = "Пустоту скидывать нельзя";
        }
        return result;
    }


    public String add(String number1, String number2) {
        String result = "";

        if (number1 != null && number2 != null) {
            if (!isNumeric(number1) || !isNumeric(number2)) {
                result = "Буквы вводить нельзя!";
            } else if (number1.contains("-") || number2.contains("-")) {
                result = "Отрицательные числа нельзя!";
            } else {
                int num1 = Integer.parseInt(number1.trim());
                int num2 = Integer.parseInt(number2.trim());
                result = String.valueOf(num1 + num2);
            }
        } else {
            result = "Пустоту скидывать нельзя";
        }
        return result;
    }

    public static boolean isNumeric(String arg){
        try {
            Double.parseDouble(arg);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
