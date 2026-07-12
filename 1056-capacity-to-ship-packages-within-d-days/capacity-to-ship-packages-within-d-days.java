class Solution {
    static int dassy(int [] arr, int cap){
        int day=1;
        int load=0;
        for(int i : arr){
            if(load+i>cap){
                day++;
                load=i;
            }
            else load+=i;
        }
        return day;
    }


    public int shipWithinDays(int[] weights, int days) {
        
        int low= Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans =0;

        while(low<=high){
            int mid= (low+high)/2;
            int r= dassy(weights, mid);
            if(r<=days){
                ans = mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;

        

        
    }
}