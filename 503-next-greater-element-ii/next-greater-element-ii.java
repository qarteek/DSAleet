class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int []ne = new int[n];
        Stack<Integer> nq = new Stack<>();
        for(int  i = 2 *n-1;i>=0;i--){
            while(!nq.isEmpty() && nq.peek()<= nums[i%n]){
                nq.pop();
            }
            if(i<n){
                ne[i] = nq.isEmpty() ? -1 : nq.peek();
            }
            nq.push(nums[i%n]);
            
        }
        return ne;
        
    }
}