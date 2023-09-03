public class missingnumberinarray
{
    public static void main(String[] args) {

    }
        public int missingNumber(int[] arr)
        {
            // no from 0 to n = so there will be total n+1 nos.
            // ex N=4, arr [4,0,2,1]
            // [0,1,2,3,4] so missing no is 3;
            // here in this question is given from 0 to n. so the index value and the elemnet at index will also be same like at index 1 the element will also be 1.

            int i = 0;
            while(i<arr.length)
            {
                int check = arr[i];
                if(arr[i]<arr.length && arr[i] !=arr[check])
                {
                    swap(arr,i,check);
                }
                else
                {
                    i++;
                }
            }
            // search for first missing number
            for (int index = 0; index < arr.length;index++)
            {
                if(arr[index]!= index)
                {
                    return index;
                }
            }

            //case 2
            return arr.length;


        }
        public void swap(int [] arr, int first, int second)
        {
            int temp = arr[first];
            arr[first]= arr[second];
            arr[second]= temp;
        }

    }

