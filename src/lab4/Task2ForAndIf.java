package lab4;

public class Task2ForAndIf {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println(i+" Число делится на 3 и 5");
            }
            else if(i%3 == 0){
                System.out.println(i+" Число делится на 3");
            }
            else if (i%5 == 0){
                System.out.println(i+" Число делится на 5");
            }
        }
    }

}
