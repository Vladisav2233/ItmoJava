package lab4;

import java.util.Scanner;

public class Task3IfElse {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        Scanner scan1 = new Scanner(System.in);
        int b = scan.nextInt();
        System.out.println("Введите третье число");
        Scanner scan2 = new Scanner(System.in);
        int c = scan.nextInt();
        sum3AndCheck(a, b, c);

    }

    public static boolean sum3AndCheck(int a, int b, int c) {
        if (a + b == c) {
            System.out.println("Результат true");
            return (true);
        } else {
            System.out.println("Результат false");
            return (false);
        }
    }
}

