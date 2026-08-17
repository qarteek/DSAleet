class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return retro(nums , k) - retro(nums, k-1);
       

        
    }

    public int retro(int[] nums, int k){
        Map<Integer, Integer> ne = new HashMap<>();
        int n = nums.length;
        int l = 0;
        int r = 0;
        int count = 0;
        while(r<n){
            ne.put(nums[r], ne.getOrDefault(nums[r], 0)+1);

            if(ne.get(nums[r])==1){
                k--;
            }

            while(k<0){
                ne.put(nums[l], ne.getOrDefault(nums[l], 0)-1);

                if(ne.get(nums[l])==0){
                    k++;
                }

                l++;


            }

            count += (r-l+1);

            r++;

        }
        return count;

    }
}