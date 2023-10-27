import calculator.CalculatorCMD;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean Exit = true;
        while (Exit == true) {

            System.out.println(ANSI_GREEN + "Enter firs count" + ANSI_RESET);
            int a = input.nextInt();

            System.out.println(ANSI_GREEN + "Enter sign(+,-,*,/, **,root(square root),root2(cube root)" + ANSI_RESET);

            String sign;
            sign = input.next();

            System.out.println(ANSI_GREEN + "Enter second count" + ANSI_RESET);
            int b = input.nextInt();

            switch (sign) {
                case "+" -> System.out.println(ANSI_RED + "Answer " + CalculatorCMD.summation(a, b) + ANSI_RESET);
                case "-" -> System.out.println(ANSI_RED + "Answer " + CalculatorCMD.subtraction(a, b) + ANSI_RESET);
                case "/" -> System.out.println(ANSI_RED + "Answer " + CalculatorCMD.division(a, b) + ANSI_RESET);
                case "*" -> System.out.println(ANSI_RED + "Answer " + CalculatorCMD.multiplication(a, b) + ANSI_RESET);
                case "**" -> System.out.println(ANSI_RED + "Answer " + Math.pow(a, b) + ANSI_RESET);
                case "root" -> System.out.println(ANSI_RED + "Answer " + Math.sqrt(a) + ANSI_RESET);
                case "root2" -> System.out.println(ANSI_RED + "Answer " + Math.cbrt(a) + ANSI_RESET);

            }
            System.out.println("Type 0 to exit. Type 1 to continue");
            int exit = input.nextInt();

            if (exit == 0) {
                Exit = false;
            }
            else {
                Exit = true;
            }
        }
    }
}