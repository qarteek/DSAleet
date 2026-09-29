class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;

        int sum = 0;

        int minl = Integer.MAX_VALUE;

        for(int ri = 0; ri<nums.length;ri++){

            sum+=nums[ri];

            while(sum>=target){
                minl = Math.min(minl, ri-low+1);
                sum-=nums[low];

                low++;


            }
        }
        return minl == Integer.MAX_VALUE ? 0 : minl;        
    }
}