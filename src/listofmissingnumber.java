import java.util.ArrayList;
import java.util.List;
public class listofmissingnumber
{
    public static void main(String[] args)
    {

    }
        public List<Integer> findDisappearedNumbers(int[] arr)
        {
            // IF range = [0,n]
            // then every element will be at index = value;
            // if range = [1,n]
            // then every element will be at index value -1;

            int i = 0;
            while (i<arr.length)
            {
                int check = arr[i]-1;

                if (arr[i] != arr[check])
                {
                    swap(arr,i,check);
                }
                else
                {
                    i++;
                }

            }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index<arr.length;index ++)
            {
                if(arr[index]!= index+1)
                {
                    ans.add(index +1);
                }
            }
            return ans;

        }
        public void swap(int [] arr, int first, int second)
        {
            int temp = arr[first];
            arr[first]= arr[second];
            arr[second]= temp;
        }
    }

