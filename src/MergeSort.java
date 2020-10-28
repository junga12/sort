public class MergeSort {
    private static int[] sorted;

    public static int[] mergeSort(int[] arr) {
        sorted = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, 0, middle);
            mergeSort(arr, middle+1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int i = left;
        int j = middle+1;
        int k = left;

        while (i <= middle && j <= right) {
            if (arr[i] < arr[j]) {
                sorted[k] = arr[i++];
            } else {
                sorted[k] = arr[j++];
            }
            k++;
        }

        while (i <= middle) {
            sorted[k++] = arr[i++];
        }

        while (j <= right) {
            sorted[k++] = arr[j++];
        }

        for (int m = left; m <= right; m++) {
            arr[m] = sorted[m];
        }
//        System.arraycopy(sorted, left, arr, left, right + 1 - left);
    }
}
