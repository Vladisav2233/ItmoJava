package lab4;

import java.util.Scanner;

public class Task4IfElseIfElse {
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
        check3number(a, b, c);
    }
    public static boolean check3number(int a , int b, int c){
        if(b > a && c > b){
            System.out.println("Значение true");
            return (true);
        }
        else{
            System.out.println("Значение false");
            return (false);
        }
    }
}
