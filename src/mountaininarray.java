public class mountaininarray {
    public static void main(String[] args) {
        int arr[] = {1,2, 3, 4, 5, 3, 2, 1};
        System.out.println(peakIndexInMountainInArray(arr));
    }

    public static int peakIndexInMountainInArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > arr[middle + 1]) {
                // You are in decreasing order.
                // This may be the answer but once check left.
                // This is why end is not mid - 1.
                end = middle;
            } else {
                // You are in the ascending part.
                start = middle + 1; // Because we know the next element is greater than mid.
            }
        }
        // In the end, start == end and is pointing to the largest number because of the two checks.
        // Start and end are always trying to find the max element in the above 2 checks.
        // Hence, when they are pointing to just 1 element, that is the maximum.
        return arr[start];
    }
}
