package lab4;

public class Task6Arrey {
    public static void main(String[] args) {
        int myArray[] = new int[]{1, 1, 3, 4, 5, 6, 7};
        check(myArray);
    }

    public static boolean check(int myArray[]) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                a = a+1;
            } else if (myArray[i] == 3) {
                b = b+1;
            }
        }
        if (a != 0 || b != 0) {
            System.out.println("Мссив содержит цифру 1 или 3");
            return (true);
        } else {
            System.out.println("Мссив не содержит цифр 1 или 3");
            return (false);
        }
    }
}
