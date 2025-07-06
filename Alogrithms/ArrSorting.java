import java.util.Arrays;

class ArrSorting {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 5, 2, 7 };
        int l = arr.length - 1;
        for (int i = 0; i <= l; i++) {
            for (int j = 0; j <= l; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}