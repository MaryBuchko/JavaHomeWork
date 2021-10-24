package com.pb.buchko.hw3;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите массив из 10-ти чисел:");
        int massiv[] = new int[10];//создаю массив размером 10
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = input.nextInt();// заполняю массив с клавиатуры
        }
        System.out.println("Введенные элементы массива:");
        for (int i=0;i < massiv.length;i++){
            System.out.print(massiv[i]+ "   ");// вывожу массив на экран
        }
        System.out.println();
        int sum = 0; // цикл для обхода каждого элемента массива
        for(int arr: massiv) {
            sum = sum + arr; // суммирую каждый элемент массива
        }
        System.out.println("Сумма элементов введенного массива равна: " + sum);
        int num = 0;
        for (int i=0 ; i< massiv.length; i++){
            if (massiv[i]>0 ){  // нахожу положительные элементы
                num++;
            }
        }
        System.out.println("Количество элементов массива больше нуля: "+ num);
        boolean isSorted = false;  //сортирую по алгоритму пузырька
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < massiv.length-1; i++) {
                if(massiv[i] > massiv[i+1]){
                    isSorted = false;
                    buf = massiv[i];
                    massiv[i] = massiv[i+1];
                    massiv[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(massiv));
    }
}
