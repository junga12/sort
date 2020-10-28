public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int target = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > target) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
        return arr;
    }
}
