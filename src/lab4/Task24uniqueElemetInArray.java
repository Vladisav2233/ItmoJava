package lab4;

public class Task24uniqueElemetInArray {
    public static void main(String[] args) {
        int myArray[] = new int[]{1, 1, 1, 2, 3, 3, 3, 6};
        for (int i = 0; i < myArray.length; i++)
        {
            boolean f = true;

            for (int j = 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i!=j){
                             f = false;
                }
            }
            if(f){
                System.out.print(myArray[i]);
                break;
            }
        }

    }
}
