import java.util.ArrayList;
import java.util.List;

    class duplicateslistinarray
    {
        public List<Integer> findDuplicates(int[] arr)
        {
            List<Integer> duplicates = new ArrayList<>();
            int i = 0;
            while (i < arr.length)
            {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct])
                {
                    swap(arr, i, correct);
                } else
                {
                    i++;
                }
            }

            for (i = 0; i < arr.length; i++)
            {
                if (arr[i] != i + 1) {
                    duplicates.add(arr[i]);
                }
            }

            return duplicates;

        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
    // contributed by priyanshu kumar

