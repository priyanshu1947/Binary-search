public class findaccendingordecending
{
    public static void main(String[] args) {
        //int[] arr = {98, 87, 65, 43, 32, 31, 30, 21, 2, 1};
        int[] arr = {9, 19, 29, 34, 36, 45, 50, 55, 60, 71};
        int target = 30;
        int ans = findOrder(arr, target);
        System.out.println(ans);
    }

    static int findOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end]; // Compare first and last elements

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAscending) {
                if (arr[middle] > target) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (arr[middle] < target) {
                    start = middle - 1;
                } else {
                    end = middle + 1;
                }
            }
        }
        return -1;
    }
}
