import java.util.Arrays;

public class selectionsort
{
    public static void main(String[] args)
    {
        int [] arr = {3,1,5,4,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionsort(int [] arr)
    {
        for (int i = 0; i <arr.length ; i++)
        {
            // find the max item in the remaining array  and swap
            // with corect index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swaparray(arr,maxIndex,last);
        }
    }
    static void swaparray(int [] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;
        for (int i = start; i <= end ; i++)
        {
            if (arr[max] < arr[i])
            {
                max = i;
            }

        }
        return max;
    }
}
