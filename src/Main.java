import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //filling an array with random numbers
        Random random = new Random();
        int [] arr = new int [5];

        for (int i = 0; i< arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //creating copy of an array
        int [] copyArr = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            copyArr[k] = arr[k];
        }
        int counter = 0;

        //checking if any number has appeared more than once
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == copyArr [j] ) {
                    if (copyArr[j] > 0) {
                        counter++;
                        copyArr[j] = -1;
                    }
                } else {
                    continue;
                }
            }
            if (counter > 1) {
                System.out.println("Number " + arr[i] + " has appeared " + counter + " times");
                arr[i] = -1;

            }
            counter = 0;
        }
    }
}