//  MERGE SORT 

//  // TIME COMPLEXITY    LOG N BASE 2 N^2

public class mergeSort {

    public static void conqure(int arr[], int si, int mid, int end) {
        int merged[] = new int[end - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= mid) {
            merged[x++] = arr[idx2];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int st, int end) {
        if (st >= end) {
            return;
        }
        int mid = st + (end - st) / 2;
        divide(arr, st, mid);
        divide(arr, mid + 1, end);
        conqure(arr, st, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 10 };
        int n = arr.length;

        // CALLING
        divide(arr, 0, n - 1);

        for (int index = 0; index < n; index++) {
            System.out.println(arr[index] + " ");
        }
        System.out.println();

    }
}
