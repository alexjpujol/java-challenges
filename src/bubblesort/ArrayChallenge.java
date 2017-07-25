package bubblesort;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayChallenge {

    static int[] myValues = new int[5];

    public static int[] getIntegers() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter five integers \r");

        for (int i = 0; i < myValues.length; i++) {
            myValues[i] = keyboard.nextInt();
        }

        return myValues;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element: " + i + ", Value: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] firstArray) {

//        int[] sortedValues = new int[myValues.length];
//        for (int i = 0; i < firstArray.length; i++) {
//            sortedValues[i] = myValues[i];
//        }


        //copy one array into another. you can loop through like the above commented code, or use the below method
        int[] sortedValues = Arrays.copyOf(firstArray, firstArray.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedValues.length - 1; i++) {
                if(sortedValues[i] < sortedValues[i + 1]) {
                    temp = sortedValues[i];
                    sortedValues[i] = sortedValues[i + 1];
                    sortedValues[i + 1] = temp;
                    flag = true;
                }
            }
        }

        printArray(sortedValues);

        return sortedValues;
    }


    public static void main(String[] args) {

    getIntegers();
    sortIntegers(myValues);

    }
}
