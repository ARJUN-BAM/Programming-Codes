import java.util.*;
class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size ;i++)
        {
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,size-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[]arr,int low,int high)
    {
        if(low<high)
        {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int[]a,int i ,int j)
    {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}