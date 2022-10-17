package sortingAlgo;

public class BubbleSort {
    //Mein Algo ist bereits ein Bubble Sort
    public static int[] sortArray(int[] array) {
        while(true){
            boolean isSorted = true;
            for (int i = 0; i < array.length; i++) {
                if(i+1 < array.length){
                    if(array[i] > array[i+1]){
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        isSorted = false;
                    }
                }
            }
            if(isSorted){
                break;
            }
        }
        return array;
    }
}
