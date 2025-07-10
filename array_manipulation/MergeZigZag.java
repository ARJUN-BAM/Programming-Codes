package Arr_Manipulation;
import java.util.Arrays;
public class MergeZigZag {
	public static void main(String[] args) {
		int[] ar1  = {1,2,3,5,1,16,12,13,14};
		int[] ar2 = {7,8,9,10};
		System.out.println(Arrays.toString(returnMergeAr(ar1,ar2)));
		
	}
//	public static int[] returnMergeAr(int[] ar1, int[]ar2)
//	{
//		int[] res = new int[ar1.length+ar2.length];
//		boolean flag = false,flagFilled = false;
//		for(int i = 0,j=0 ; i<(ar1.length+ar2.length);i++)
//		{
//			 if(!flag && j<ar1.length)
//			{
//				
//				res[i] = ar1[j];
//				flag = true;
//			}
//			else if(flagFilled)
//			{
//				res[i] = ar1[j++];
//			}
//			else if(j==ar2.length)
//			{
//				flagFilled = true;
//				j++;
//				i--;
//			}
//			else {
//				res[i] = ar2[j++];
//				flag = false;
//			}
//		}
//		return res;
//	}
	public static int[] returnMergeAr(int[] ar1, int[] ar2) {
	    int[] res = new int[ar1.length + ar2.length];
	    int i = 0, j = 0, k = 0;

	    while (i < ar1.length && j < ar2.length) {
	        res[k++] = ar1[i++];
	        res[k++] = ar2[j++];
	    }

	    while (i < ar1.length) {
	        res[k++] = ar1[i++];
	    }

	    while (j < ar2.length) {
	        res[k++] = ar2[j++];
	    }

	    return res;
	}



}
