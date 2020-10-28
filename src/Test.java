import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 4, 2, 3, 1, 8, 7};

        System.out.println("unsorted List");
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------");
        System.out.println("Bubble sort");
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr.clone())));
        System.out.println();
        System.out.println("Selection sort");
        System.out.println(Arrays.toString(SelectionSort.selectionSort(arr.clone())));
        System.out.println();
        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(InsertionSort.insertionSort(arr.clone())));
        System.out.println();
        System.out.println("Merge sort");
        System.out.println(Arrays.toString(MergeSort.mergeSort(arr.clone())));
        System.out.println();
        System.out.println("Quick sort");
        System.out.println(Arrays.toString(QuickSort.quickSort(arr.clone())));
        System.out.println();
    }
}
