class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int ec=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt=1;
                ec=nums[i];
            }
            else if(nums[i]==ec){
                cnt++;
            }
            else cnt--;
        }
        int cn=0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==ec) cn++;

        }
        if(cn>nums.length/2) return ec;

        return -1;



                
    }
    
}