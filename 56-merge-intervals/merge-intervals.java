class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merge= new ArrayList<>();


        int n= intervals.length;
        int [] prev= intervals[0];
        for(int i=1; i<n;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]= Math.max(prev[1],intervals[i][1]);
            }
            else{
                merge.add(prev);
                prev=intervals[i];
            }
        }
        merge.add(prev);
        return merge.toArray(new int[merge.size()][]);

        
        
    }
}