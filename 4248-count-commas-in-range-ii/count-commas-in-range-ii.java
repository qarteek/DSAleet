class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0      ;  }

        long count =0;
        long Thresold = 1000L;
        int comma = 1;

        while(Thresold<=n){
            Long neww = Thresold*1000;
            Long end = Math.min(n, neww-1);

            count += (end-Thresold+1)*comma;

            Thresold = neww;

            comma++;
        }
        return count;
        
    }
}