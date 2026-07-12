class Solution {

 static int divi(int[] arr,int mid){
    int wtv=0; 
    for(int i= 0;i<arr.length;i++){
        wtv += Math.ceil((double)arr[i]/mid);
        
    }
    return wtv;
    
 }

    public int smallestDivisor(int[] nums, int threshold) {
        int n= nums.length;
        if(nums.length> threshold) return  -1;

        // int max = Integer.MIN_VALUE;
        // for(int i =0;i<n;i++){
        //     max= Math.max(max, nums[i]);
        // }

        int low = 1;
        int high =1000000 ;

        while(low<=high){
            int mid = (low+high)/2;
            if(divi(nums, mid ) <=  threshold){
                high=mid-1;
            }
            else low=mid+1;

        
        }
        return low;
        
    }
}