public class Rotatedbinarysearch {
    public static void main(String[] args) {

    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;

            // 4 cases here

            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1])
            {
                return mid -1;
            }
            if(arr[mid] <= arr[start])
            {
                end = mid-1;
            }
            else {
                start= mid+1;
            }
        }
        return -1;
    }


}
