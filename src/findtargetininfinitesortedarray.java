public class findtargetininfinitesortedarray
{
    public static void main(String[] args)
    {
        // start with box of size 2

        int arr [] = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int [] arr , int target){
        // first find the range
        // first start with box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while  (target>arr[end])
        {
            int temp = end+1;
            // double the size so new end will be previoous end+ 2*size of the box
            end = end + (end -start +1)*2;
            start = temp;
        }
        return binarysearch(arr,target,start,end);
    }

    static int binarysearch(int [] arr, int target, int start , int end)
    {
        while (start<= end)
        {
            int middle= start+  (end-start)/2;

            if (target<arr[middle])
            {
                end = middle-1;
            }
            else if (target>arr[middle])
            {
                start = middle +1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

}
