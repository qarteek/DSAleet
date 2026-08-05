class Solution {
    public int trap(int[] h) {
        int lm = 0;
        int rm= 0;
        int tot = 0;

        int l = 0;
        int k = h.length-1;
        while(l<=k){

            if(h[l]<=h[k]){
                if(h[l]>=lm){
                    lm = h[l];

                }
                else tot += lm -h[l];
                l++;
            }

            else{
                if(h[k]>=rm){
                    rm = h[k];
                }
                else{
                    tot += rm -h[k];

                }
                k--;
            }

        }
        return tot;

        
    }
}