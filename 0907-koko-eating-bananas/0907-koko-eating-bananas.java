class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=-1;
        int k=0;
        //Getting the  highest value in the array
        for(int i:piles){
            high=Integer.max(high,i);
        }
        //Search  over the values from 1 to high 
        while( low < high){
            int m=(low+high)/2;
             k=0;
            for(int val:piles){
                //total timing when each piles were eaten in m per hour
                k+=Math.ceil((double)val/m);
             }
             //check whether the total timing is less than h if it is then   keep high = m
             //if m is answer than m+1 definetly the answer but m-1 may or may not be the answer
             //so always keep high as m
             if(k <= h) high=m;
             // if  it takes time greater than h then move l to m+1
             else low=m+1;
        }
        return high;
    }
}