package com.pb.buchko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int y;
        System.out.print("Введите целое число и нажмите Enter: ");
        y = scan.nextInt();

        if (y <= 14 && y >= 0) {
            System.out.print("Введенное число попадает в промежуток [0 -14]");
        } else if (y <= 35 && y >= 15) {
            System.out.print("Введенное число попадает в промежуток [14 -35]");
        } else if (y <= 50 && y >= 36) {
            System.out.print("Введенное число попадает в промежуток [36 -50]");
        } else if (y <= 100 && y >= 51) {
            System.out.print("Введенное число попадает в промежуток [51 -100]");
        } else {
            System.out.print("Введенное число не попадает ни в один из имеющихся промежутков [0 -14] [15 - 35] [36 - 50] [51 - 100]");
        }
    }
}
