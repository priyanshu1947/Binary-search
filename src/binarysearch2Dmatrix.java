import java.util.Arrays;

public class binarysearch2Dmatrix
{
    public static void main(String[] args)
    {
        int [] [] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,6)));

    }

    static int [] binarysearch(int [] [] matrix,int row, int colsstart, int colsend,int target)
    {
        while (colsstart<=colsend)
        {
            int middle = colsstart+(colsend-colsstart)/2;
            if(matrix[row][middle]==target)
            {
                return new int[]{row,middle};
            }
            if (matrix[row][middle]<target)
            {
                colsstart= middle+1;
            }
            else {
                    colsend= middle-1;
            }

        }
        return new int [] {-1,-1};
    }
    static int [] search(int [][] matrix, int target)
    {
        int row = matrix.length;
        int cols = matrix[0].length;

        if(row==1)
        {
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rstart=0;
        int rend = row-1;
        int midcols = cols/2;
        while (rstart<(rend-1))
        {
            int mid = rstart+(rend-rstart)/2;
            if (matrix[mid][midcols]==target)
            {
                return new int[]{mid,midcols};
            }
            if (matrix[mid][midcols]<target)
            {
                rstart=mid;
            }
            else {
                rend=mid;
            }
        }
        // now we have two rows
        if (matrix[rstart][midcols]==target)
        {
            return new int[]{rstart,midcols};
        }
        if (matrix[rstart+1][midcols]== target)
        {
            return new int[]{rstart+1,midcols};
        }
        // otherwise check in 1st half
        if (target<= matrix[rstart][midcols-1])
        {
            return binarysearch(matrix,rstart,0,midcols-1,target);
        }
        //check in 2nd half
        if (target>= matrix[rstart][midcols+1]&& target<=matrix[rstart][cols-1])
        {
            return binarysearch(matrix,rstart,midcols+1,cols-1,target);
        }
        //check in 3rd half
        if (target<= matrix[rstart+1][midcols-1])
        {
            return binarysearch(matrix,rstart+1,0,midcols-1,target);

        }
        //check in 4th half
        else
        {
            return binarysearch(matrix,rstart+1,midcols+1,cols-1,target);
        }

    }
}
