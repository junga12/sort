public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        final int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            // i번째 수 부터 정렬
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
