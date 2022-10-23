package lab4;

public class Task5Arrey {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int []{1, 2, 3, 4};
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        if(myArray[0] == 3){
            System.out.println("Число 3 является первым");

        }
        else if(myArray[myArray.length-1] == 3){
            System.out.println("Число 3 является последним");
        }
        else{
            System.out.println("Число 3 не является ни первым ни последним элементом массива");
        }
    }

}
