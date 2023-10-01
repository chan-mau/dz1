package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("java Main <первое число> <операция> <второе число>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("значение" + operator + "было не верным");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
