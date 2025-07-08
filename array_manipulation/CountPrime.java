
import java.util.Scanner;
import java.util.Arrays;
public class CountPrime {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,12,13,15,16};
        // System.out.print("Enter the size of Array: ");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int [] arr = new int[size];
        // for(int i = 0;i<size;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        System.out.println("The count of Prime Numbers in Array: "+cntArrayPrime(arr).length);
        System.out.println(Arrays.toString(cntArrayPrime(arr)));
    }
    public static int[] cntArrayPrime(int[] arr)
    {
        int count = 0;
        int[] res,temp ;
        temp = new int[arr.length];

        for(int i=0;i<arr.length;i++)
            if(isPrime(arr[i],2))
                temp[count++] = arr[i];

        res = new int[count];
        for(int i=0;i<arr.length;i++)
        {
            if(temp[i]==0)
                    break;
            res[i] = temp[i];
        }
        return res;

    }
    public static boolean isPrime(int num,int ite)
    {
        if(num<2)
            return false;
        else if(ite>num/2)
            return true;
        else if(num%ite == 0)
            return false;
        else
            return isPrime(num,++ite);
    }
}
