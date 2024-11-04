import java.util.Arrays;

public class SelectionSortTest {
    Integer[] a;

    public SelectionSortTest(Integer[] a) {
        this.a = a;
    }

    public void selectionSort() {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
                System.out.println(
                    " i = "
                    + i
                    + "; j = "
                    + j
                    + "; cur_min = "
                    + a[min_idx]
                    + "; "
                    + Arrays.deepToString(a)
                );
            }
            swap(i, min_idx);
        }
    }

    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};

        SelectionSortTest sorter = new SelectionSortTest(array);
        sorter.selectionSort();
        System.out.println("Array after sorting: " + Arrays.deepToString(sorter.a));

    }
}