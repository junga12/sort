import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            int pivot = arr[middle];
            int left = low;
            int right = high;

            while (left <= right) {
                // 왼쪽 부분 중에서 pivot보다 작은 수 탐색
                while (arr[left] < pivot) {
                    left++;
                }

                // 오른쪽 부분 중에서 pivot보다 큰 수 탐색
                while (arr[right] > pivot) {
                    right--;
                }

                if (left <= right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            if (low < right) quickSort(arr, low, right);
            if (high > left) quickSort(arr, left, high);

        }
    }
}
