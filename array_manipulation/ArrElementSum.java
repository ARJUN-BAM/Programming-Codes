package Arr_Manipulation;

public class ArrElementSum {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(returnSum(ar));
	}
	public static int returnSum(int[]ar)
	{
		int i = 0,sum=ar.length%2==0?0:ar[ar.length/2];
		while(i<(ar.length-i-1))
		{
			System.out.println("loop");
			sum+=ar[i++];
			sum+=ar[ar.length-i];
		}
		return sum;
	}
}
