
import java.util.Scanner;
class EvenOddSum {
    public static void main(String[] args) {
        System.out.print("Enter the size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(eoSumEqual(arr));
        sc.close();
    }
    public static int[] evenOddSum(int[] arr)
    {
        int[] sum = new int[2];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                sum[0] +=arr[i];
            else
                sum[1]+=arr[i];
        }
        System.out.println("OddSum: "+sum[1]+" EvenSum: "+sum[0]);
        
        return sum;
    }
    public static boolean eoSumEqual(int[] arr)
    {
        int[] sum = evenOddSum(arr);
        return sum[0]==sum[1];
    }

}