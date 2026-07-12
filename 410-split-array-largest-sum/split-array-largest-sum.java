class Solution {
    static boolean wtv(int []arr, int k , int mid){
        int partition=1;
        int subarrays=0;
        for(int nums:arr){
            if(subarrays+nums>mid){
                partition++;
                subarrays=nums;
            }
            else subarrays+=nums;
        }
        return partition<=k;
    }
    public int splitArray(int[] nums, int k) {
        int low= Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while(low<=high){
            int mid = (low+high)/2;
            if(wtv(nums, k, mid)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}