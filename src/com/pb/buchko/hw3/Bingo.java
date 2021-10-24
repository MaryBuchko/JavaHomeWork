package com.pb.buchko.hw3;
import java.util.Scanner;
import java.lang.Math;
public class Bingo {
    public static void main(String[] args) {
        int RandomNumber, UserNumber, CountTry = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ИГРА: Угадай число от 0 до 100!");
        RandomNumber = (int)Math.floor(Math.random() * 100);
        do {
            CountTry++;
            System.out.print("Введите ваш вариант числа: ");
            UserNumber = input.nextInt();
            if (UserNumber > RandomNumber)
                System.out.println("ИГРА: Моё число меньше");
            else if (UserNumber < RandomNumber)
                System.out.println("ИГРА: Моё число больше");
                 else System.out.println("Вы угадали!");
        } while (UserNumber != RandomNumber);
        System.out.println("Количество попыток: " + CountTry);
    }
}

