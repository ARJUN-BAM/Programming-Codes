// package array_manipulation;

import java.util.Scanner;

public class IsPresent {
    public static void main(String[] args) {
        // int[] arr = { 10, 20, 30, 40, 50 };
        System.out.print("Enter the size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(isPresent(arr, 50));
    }

    public static boolean isPresent(int[] arr, int target) {
        int i = 0;
        while (i < arr.length)
        {
            if (arr[i] == target)
                return true;
            i++;
        }
        return false;
    }
}
