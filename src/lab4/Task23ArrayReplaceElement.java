package lab4;

public class Task23ArrayReplaceElement {
    public static void main(String[] args) {
        int myArray[] = new int[]{1, 2, 3, 1, 2, 4};
        for (int i = 0; i< myArray.length; i++){
            System.out.print(myArray[i]+ "; ");
        }
        ArrrayReplaca(myArray);
    }


    public static int[] ArrrayReplaca(int[] array) {
        System.out.println("\n Замененнный массив");
        int a = array[0];
        int b = array[array.length - 1];
        array[0] = b;
        array[array.length - 1] = a;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "; ");
        }
        return array;

    }
}
