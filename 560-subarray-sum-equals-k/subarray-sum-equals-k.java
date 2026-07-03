class Solution {
    public int subarraySum(int[] nums, int k) {
        int psum=0;
        int c=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num: nums){
            psum+=num;
            if(map.containsKey(psum-k)){
                c+=map.get(psum-k);
            }
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return c;
    }
}