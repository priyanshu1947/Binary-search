public class ceiningofanumber
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 20;
        int ans = ceiling(arr,target);

        System.out.println(ans);


    }
    // int [] arr = {2,3,5,9,14,16,18}
    // ceiling = smallest elememnt in array greater or = target
    // ceiling ( arr,target=14) = 14
    // ceiling ( arr,target=15) = 16
    // floor= greatest number that is smaller or = to target number.
    // floor ( arr,target=15) = 14
    static int ceiling(int [] arr, int target)
    {
        if (target> arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length;

        while (start<=end)
        {
            int middle = start + (end - start)/2;
            if (arr[middle]<target){
                start= middle+1;
            } else if ((arr[middle]>target))
            {
                end = middle-1;
            }
            else {
                return middle;
            }
        }
        return end;
    }

}
