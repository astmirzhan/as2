public class SelectionSortTest {

    public static void testEmptyArray() {
        int[] arr = {};
        SelectionSort.selectionSort(arr);
        assert arr.length == 0 : "Test failed for empty array.";
    }

    public static void testSingleElementArray() {
        int[] arr = {5};
        SelectionSort.selectionSort(arr);
        assert arr[0] == 5 : "Test failed for single element array.";
    }

    public static void testArrayWithDuplicates() {
        int[] arr = {3, 1, 2, 3, 3};
        SelectionSort.selectionSort(arr);
        assert arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 3 && arr[4] == 3 : "Test failed for array with duplicates.";
    }

    public static void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        SelectionSort.selectionSort(arr);
        assert arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5 : "Test failed for already sorted array.";
    }

    public static void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort.selectionSort(arr);
        assert arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5 : "Test failed for reverse sorted array.";
    }

    public static void testLargeInput() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100000);
        }
        SelectionSort.selectionSort(arr);
        for (int i = 1; i < arr.length; i++) {
            assert arr[i - 1] <= arr[i] : "Test failed for large random input.";
        }
    }

    public static void main(String[] args) {
        testEmptyArray();
        testSingleElementArray();
        testArrayWithDuplicates();
        testSortedArray();
        testReverseSortedArray();
        testLargeInput();

        System.out.println("All tests passed!");
    }
}