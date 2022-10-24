package lab1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        /////////Task1//////////////

        System.out.println("Задание 1");
        System.out.println("Я\nхорошо\nзнаю\nJava\n");

        /////////Task2//////////////

        System.out.println("Задание 2");
        System.out.println((46+10)*(10/3));
        System.out.println(29*4*(-15)+"\n");

        /////////Task3//////////////

        System.out.println("Задание 3");
        int number = 10500;
        System.out.println("Результат вычисления = "+(number/10)/10+"\n");

        /////////Task4//////////////

        System.out.println("Задание 4");
        double result = 3.6*4.1*5.9;
        System.out.println("Результат вычислен = "+result+"\n");

        /////////Tas5//////////////

        System.out.println("Задание 5");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int ascan = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите второе целое число");
        int bscan = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите третье целое число");
        int сscan = scan.nextInt();
        System.out.println("Ваши числа");
        System.out.println(ascan+"\n"+bscan+"\n"+сscan+"\n");
        ////////////////Task6//////////
        Scanner scan6 = new Scanner(System.in);
        System.out.println("Задание №6");
        System.out.println("Введите число для проверки на четность");
        int bscan6 = scan6.nextInt();
        if (bscan6%2 != 0 ){
            System.out.println("Число не четное");
        }
        else if (bscan6%2 == 0 && bscan6 > 100) {
            System.out.println("Выход за пределы диапазона");
        }
        else {
            System.out.println("Число четное");
        }
    }
}