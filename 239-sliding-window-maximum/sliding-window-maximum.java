class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> ne = new ArrayDeque<>();
        List<Integer> asn =  new ArrayList<>();

        for(int i = 0 ; i < nums.length; i++){
            if(!ne.isEmpty() && ne.peekFirst()<= i-k ){
                ne.removeFirst();
            }

            while(!ne.isEmpty() && nums[ne.peekLast()]< nums[i]){
                ne.removeLast();
            }

            ne.addLast(i);

            if(i>=k-1){
                asn.add(nums[ne.peekFirst()]);
            }

        }
        return asn.stream().mapToInt(Integer::intValue).toArray();
        
    }
}