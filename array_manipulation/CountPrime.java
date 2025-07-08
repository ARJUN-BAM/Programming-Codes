
import java.util.Scanner;
import java.util.Arrays;
public class CountPrime {
    public static void main(String[] args) {
        System.out.print("Enter the size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The count of Prime Numbers in Array: "+cntArrayPrime(arr).length);
        System.out.println(Arrays.toString(cntArrayPrime(arr)));
    }
    public static int[] cntArrayPrime(int[] arr)
    {
        int count = 0;
        int[] res ;
        for(int i=0;i<arr.length;i++)
            if(isPrime(arr[i],2))
                count++;
        res = new int[count];
        for(int i=0, j = 0;i<arr.length;i++)
            if(isPrime(arr[i],2))
                res[j++] = arr[i];

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
