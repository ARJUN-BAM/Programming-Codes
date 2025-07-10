package Arr_Manipulation;
import java.util.Arrays;
public class ArrPrime {
	public static void main(String[] args) {
		int[] arr = {10,12,13,14,15,17,19};
		
		System.out.println("COunt of Prime numbers: "+ Arrays.toString(givePrime(arr)));
	}
	public static int[] givePrime(int[] arr)
	{
		int[] temp = new int[arr.length];
		int cnt = 0;
		for(int i = 0; i<arr.length;i++)
		{
//			System.out.println(isPrime(arr[i],2));
			if(isPrime(arr[i],2))
				temp[cnt++] = arr[i];
		}
			
		int[] res = new int[cnt];
		for(int i =0;i<cnt;i++)
			res[i]=temp[i];
		return res;
	}
	public static boolean isPrime(int num,int ite)
	{
		if(num<2)
			return false;
		if(ite>num/2)
			return true;
		if(num%ite==0)
			return false;
		return isPrime(num,++ite);
	}
}
