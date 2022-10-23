package lab2;

public class Calculator {
    //Сумма
    public static int sum (int a, int b){
        return a+b;
    }
    public static double sum (double a, double b){
        return a+b;
    }
    public static long sum (long a, long b){
        return a+b;
    }


    //Вычитание
    public static int sub (int a, int b){
        return a-b;
    }
    public static double sub (double a, double b){
        return a-b;
    }
    public static long sub (long a, long b){
        return a-b;
    }

    //Умножение
    public static int mul (int a, int b){
        return a*b;
    }
    public static double mul (double a, double b){
        return a*b;
    }
    public static long mul (long a, long b){
        return a*b;
    }

    //Деление
    public static int div (int a, int b){
        return a/b;
    }
    public static double div (double a, double b){
        return a/b;
    }
    public static long div (long a, long b){
        return a/b;
    }

    public static void main(String[] args) {
        //////Task/////
        System.out.println("Задание №1 \n");
        System.out.println("Сложение \n");
        System.out.println(Calculator.sum(10, 15));
        System.out.println(Calculator.sum(10.7, 15.7));
        System.out.println(Calculator.sum(4_000_000L, 5_000_000L));

        System.out.println("Вычитание \n");
        System.out.println(Calculator.sub(10, 15));
        System.out.println(Calculator.sub(10.7, 15.7));
        System.out.println(Calculator.sub(4_000_000L, 5_000_000L));
    }
}
