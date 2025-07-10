package Arr_Manipulation;

import java.util.Arrays;

public class BinSearch {
	public static void main(String[] args) {
		int[] arr= {1,2,4,1,2,5,6,8,19,100,12,4,3,256};
		Arrays.sort(arr);
		int target = 105;
		int f = 0;
		int l = arr.length-1;
		int res = 0; 
		System.out.println(Arrays.toString(arr));
		while(true&&f<l)
		{
			int mid  = (f+l)/2;
//			System.out.println(arr[mid]);
			if(target>arr[mid])
				f=mid+1;
			else if(target<arr[mid])
				l=mid-1;
			else if(target==arr[mid])
			{
				res = mid;
				break;
			}
		}
		System.out.println("The target "+target+" is at "+(f==l?-1:(res))+"th index.");
	}
}
