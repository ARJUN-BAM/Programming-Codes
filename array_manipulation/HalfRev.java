
import java.util.Arrays;
import java.util.Scanner;

public class HalfRev {
    public static void main(String[] args) {
        // int[] arr = { 10, 20, 30, 40, 50, 60,70,80,90,100,110};
        System.out.print("Enter the size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        halfRevArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void halfRevArr(int[] arr) {
        int f = (arr.length) / 2;
        int l = arr.length - 1;
        for (int i = l; i >= f; i--,f++) {
            int temp = arr[i];
            arr[i] = arr[f];
            arr[f] = temp;
        }

    }
}
