package sortingAlgo;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Sort Array
        int[] array = generateArray(4);
        System.out.print("Unsorted Array: ");
        printArray(array);
        System.out.print("Sorted Array: ");
        printArray(InsertionSort.insertionSort(array));

        //Revert Array
        int[] invertedArray = BasicAlgo.revert(array);
        System.out.print("Inverted Array: ");
        printArray(invertedArray); 

        //Search Array for maximum value
        int max = BasicAlgo.max(array);  
        System.out.println("Max value: " + max); 
        
        //Search Array for minimum value
        int min = BasicAlgo.min(array);  
        System.out.println("Min value: " + min);
    }

    public static int[] generateArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
