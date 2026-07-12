class Solution {

 static int divi(int[] arr,int divisor ){
    int wtv=0; 
    for(int i= 0;i<arr.length;i++){
        wtv += (arr[i] + divisor - 1) / divisor;;
        
    }
    return wtv;
    
 }

    public int smallestDivisor(int[] nums, int threshold) {
        int n= nums.length;
        if(nums.length> threshold) return  -1;

    

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