class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

         int c = 1; 
         int last = intervals[0][1];

         for(int i = 1; i< intervals.length; i++){
            if(last<=intervals[i][0]){
                c+=1;
                last = intervals[i][1];
            }
         }
         return intervals.length-c;
        
    }
}