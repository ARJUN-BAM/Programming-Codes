// package array_manipulation;

import java.util.Arrays;

public class RepitationEle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3, 4, 5, 2 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        repEle(arr);
    }

    public static void repEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i], count = 0, j = i;
            while (ele == arr[j] && j<arr.length) {
                count++;
                j++;
            }
            i = j;
            System.out.println(ele + ": " + count);
        }
    }

}
