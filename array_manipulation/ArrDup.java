package Arr_Manipulation;

import java.util.Arrays;

public class ArrDup {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(createDuplicate(ar)));
	}
	public static int[] createDuplicate(int[]ar)
	{
		int[] dup = new int[ar.length];
		int i = 0;
		while(i<(ar.length-i)) {
			dup[i] = ar[i++];
			dup[ar.length-i]= ar[ar.length-i];
			System.out.println("Looping");
		}
		return dup;
	}
}
