public class searchingusingbinary
{
    public static void main(String[] args)
    {
        int arr[] = {-5,-6,2,3,4,5,6,7,8,89,98};
        int target = 89;


        System.out.println(binarysearch(arr,target));



    }
    // return the index
    static int  binarysearch(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while (start<=end)
        {
            // find the middle element

            int middle = start + (end-start)/2;
            if (arr[middle]>target)
            {
                end = middle-1;
            }
            else if (arr[middle]<target)
            {
                start= middle+1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

}