package lab4;

import java.util.Scanner;

public class Task22ArrayFromConsole {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int leng = scan.nextInt();
        int myArray[] = new int[leng];
        for (int i=0; i < leng; i++ ){
            System.out.println("Введите элемент массива");
            myArray[i]=scan.nextInt();
        }
        System.out.print("Result: ");
        for (int i=0; i < leng; i++ ){
            System.out.print(myArray[i]+"; ");
        }
    }
}
