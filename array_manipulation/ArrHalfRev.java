package Arr_Manipulation;

import java.util.Arrays;

public class ArrHalfRev {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		revArr(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void revArr(int[] arr)
	{
		int f = arr.length/2;
		int l = arr.length-1;
		while(f<l)
		{
			arr[f] = arr[f] + arr[l];
			arr[l] = arr[f] - arr[l];
			arr[f] = arr[f] - arr[l];
			f++;
			l--;
		}
	}
}
