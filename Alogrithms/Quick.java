import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 15, 25 };
        quickShot(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickShot(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickShot(arr, low, pivot - 1);
            quickShot(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swapArr(arr, i, j);
            }
        }
        swapArr(arr, i + 1, high);
        return i + 1;
    }

    public static void swapArr(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
