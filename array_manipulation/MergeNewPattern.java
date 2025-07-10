package Arr_Manipulation;

import java.util.Arrays;

public class MergeNewPattern {
	public static void main(String[] args) {
		int[] ar1  = {1,2,3,4,5,6,7,8,9};
		int[] ar2 = {10,11,12,13,14,15,16,17,18};
		System.out.println(Arrays.toString(returnMergeAr(ar1,ar2)));
	}
	public static int[] returnMergeAr(int[] ar1, int[] ar2) {
	    int[] res = new int[ar1.length + ar2.length];
	    int i = 0,j=ar2.length-1,k=0;
	    revArr(ar1);
	    revArr(ar2);
	    while(i<ar1.length&&j>=0)
	    {
	    	res[k++] = ar1[i++];
	    	res[k++] = ar2[j--];
	    }
	    while(i<ar1.length)
	    	res[k++] = ar1[i++];
	    while(j>=0)
	    	res[k++] = ar2[j--];

	    return res;
	}
	public static void revArr(int[] ar)
	{
		int f = 0,l=ar.length-1;
		while(f<l)
		{
			int temp = ar[f];
			ar[f] = ar[l];
			ar[l] = temp;
			f++;
			l--;
		}
	}
}
