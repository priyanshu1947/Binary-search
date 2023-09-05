public class rotationcount
{
    public static void main(String[] args)
    {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(rotationcount1(arr));
        

    }

    private static int rotationcount1(int[] arr)
    {
        int pivot = findpivot(arr);
        if (pivot==-1)
        {
            // array is not roatted
            return 0;
        }
        return pivot+1;
    }
    static int findpivot(int [] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            // 4 cases
            if (mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if (mid>start&& arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if (arr[mid]<=arr[start])
            {
                end= mid-1;
            }
            else {
                start= end+1;
            }
        }
        return -1;
    }
    static int findpivotwithduplicates(int [] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            // 4 cases

            if (mid<end&& arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if (arr[mid]== arr[start] && arr[mid] == arr[end])
            {
                if (arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end --;
            }
            else if (arr[start]<arr[mid] || arr[start]== arr[mid] && arr[mid]>arr[end])
            {
                start= mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }


}
