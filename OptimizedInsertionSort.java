

import java.util.Arrays;

public class OptimizedInsertionSort {

    static Integer[] array = {21, 16, 13, 13, 9, 6};
    static int outerIndex;
    static int temp;

    
    public static int shift(int startIndex) {
        temp = array[startIndex];
        int i = startIndex;

        for (; i > 0 && array[i - 1] > temp; i--) {
            array[i] = array[i - 1];
            System.out.println("i=" + outerIndex + "; j=" + (outerIndex - i + 1) + ": " + Arrays.deepToString(array));
        }  
        return i; 
    }
    
    public static void insert(int endIndex) {
        int position = shift(endIndex);
        
        array[position] = temp;
        System.out.println("After i<" + outerIndex + " :" + Arrays.deepToString(array));
    }

    
    public static void insertionSort() {
        for (outerIndex = 1; outerIndex < array.length; outerIndex++) {
            insert(outerIndex);
        }
    }

    public static void main(String[] args) {
        System.out.println("Initial Array: " + Arrays.deepToString(array));
        insertionSort();
        System.out.println("Sorted Array: " + Arrays.deepToString(array));
    }
}