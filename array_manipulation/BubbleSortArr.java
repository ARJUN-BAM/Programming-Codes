package Arr_Manipulation;
import java.util.Arrays;
public class BubbleSortArr {
	public static void main(String[] args) {
		int[] arr = {10,14,1,2,5,7,12};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
