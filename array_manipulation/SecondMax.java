package Arr_Manipulation;

import java.util.Arrays;

public class SecondMax {
	public static void main(String[] args) {
		int[ ]ar = {1,4,6,1,256};
		System.out.println(Arrays.toString(ar));
		System.out.println("The Second max value is: "+findSecMaxElement(ar));
		
	}
	public static int findSecMaxElement(int[] ar)
	{
		int sMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				sMax = max;
				max = ar[i];
			}
			else if(ar[i]>sMax&&ar[i]!=max)
				sMax = ar[i];
		}
			
		return sMax;
	}
}
