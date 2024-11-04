import java.util.Arrays;

public class ArraySwapper {
    static Integer[] array = {76,6,107,92,21,23,5,9,8,8143};
    static int outerIndex;
    
    public static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void insert(int endIndex) {
        int i = endIndex;
        while (i > 0 && array[i] < array[i - 1]) {
            swap(i, i - 1);
            System.out.println("i: " + i + ", j: " + (i - 1) + ", Array state: " + Arrays.deepToString(array));
            i--;
        }
    }

    public static void InsertionSort() {
        for (outerIndex = 1; outerIndex < array.length; outerIndex++) {
            insert(outerIndex);
        }
    }

    public static void main(String[] args) {
        System.out.println("Array before sorting: " + Arrays.deepToString(array));
        
        InsertionSort(); // Corrected method name
        System.out.println("Array after sorting: " + Arrays.deepToString(array));	
    }
}