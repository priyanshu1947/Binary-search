public class duplicatesinarray
{
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] arr)
    {

        //   if element is != index+1;
        //  if element at value - 1 != element at correct index then swap;
        // otherwise you got the answer

        int i = 0;
        while (i<arr.length)
        {
            if(arr[i] != i+1)
            {
                int correct = arr[i]-1;
                if (arr[i] != arr[correct])
                {
                    swap ( arr,i,correct);
                }
                else
                {
                    return arr[i];
                }

            }
            else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int [] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}

