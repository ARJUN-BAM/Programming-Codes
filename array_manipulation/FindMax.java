package Arr_Manipulation;

import java.util.Arrays;

public class FindMax {
	public static void main(String[] args) {
		int[ ]ar = {1,4,6,1,256};
		System.out.println(Arrays.toString(ar));
		System.out.println("The max value is: "+findMaxElement(ar));
		
	}
	public static int findMaxElement(int[] ar)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
			if(ar[i]>max)
				max = ar[i];
		return max;
	}
}
