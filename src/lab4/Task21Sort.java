package lab4;

public class Task21Sort {

    public static void main(String[] args) {
        int myArray[] = new int[]{1, 2, 3, 4, 5};
        //System.out.println(myArray.length);
        for (int i = 1; i <= myArray.length - 1; i++) {
            if (myArray[i - 1] > myArray[i]) {
                    System.out.println("Please try again");
                    break;
            }
            else if (i == myArray.length-1)
                System.out.println("OK");
        }
    }
}


