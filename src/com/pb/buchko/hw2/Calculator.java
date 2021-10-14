package com.pb.buchko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        double theResult;
        String sign;

        System.out.print("Введите целое число и нажмите Enter: ");
        operand1 = scan.nextInt();

        System.out.print("Введите целое число и нажмите Enter: ");
        operand2 = scan.nextInt();

        System.out.print("Введите знак арифметической операции (+, -, *, /) и нажмите Enter: ");
        sign = scan.next();

                switch (sign) {
                    case "+":
                        theResult = operand1 + operand2;
                        System.out.println("Результат:" + theResult);
                        break;
                    case "-":
                        theResult = operand1 - operand2;
                        System.out.println("Результат:" + theResult);
                        break;
                    case "*":
                        theResult = operand1 * operand2;
                        System.out.println("Результат:" + theResult);
                        break;
                    case "/":
                        if (operand2 == 0) {
                           throw new IllegalArgumentException("Делить на 0 нельзя!");
                        };
                       default:
                      theResult = operand1 / operand2;
                      System.out.println("Результат:" + theResult);
                }
            }
    }

