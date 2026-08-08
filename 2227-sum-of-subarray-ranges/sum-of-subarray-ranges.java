class Solution {
    public long subArrayRanges(int[] nums) {

        return sumofmax(nums) - sumofmin(nums);
    }


    public long sumofmax(int []nums){
        int n = nums.length;
        int [] nge = findnge(nums); 
        int [] pge = findpge(nums);

        long total = 0;
        
        for(int i = 0 ; i<n ;i++ ){
            int right  = i - pge[i];
            int left = nge[i] - i;
            
            long freq =  1L * right * left;
            total  += freq * nums[i];
            
        }
        return total;

    }
    public int[] findnge(int []nums){

        int n = nums.length;

        int[] ans = new int[nums.length];
        Stack<Integer> ne  = new Stack<>();

        for(int i = n-1; i>= 0;i--){
            while(!ne.isEmpty() && nums[ne.peek()] <= nums[i]){
                ne.pop();
            }
            ans[i] = ne.isEmpty() ? n : ne.peek();

            ne.push(i);

        }
        return ans;
    }

    public int[] findpge(int []nums){

        int n = nums.length;

        int[] ans = new int[nums.length];
        Stack<Integer> ne  = new Stack<>();

        for(int i = 0; i<n;i++){
            while(!ne.isEmpty() && nums[ne.peek()] <  nums[i]){
                ne.pop();
            }
            ans[i] = ne.isEmpty()? -1 : ne.peek();

            ne.push(i);

        }
        return ans;
    }

     public long  sumofmin(int[] arr) {

        int[] nse= findnse(arr);
        int[] pse= findpse(arr);

        long total = 0;
        // int mod = (int)1e9+7;

        for(int i = 0;i < arr.length; i++){
            int front = i - pse[i];
            int back = nse[i]-i;

            // total = (int)((total+ (front * back *1l * arr[i])% mod)%mod);
            long freq  = 1L * front * back;
            total += freq * arr[i];

        }
        return total;
        
    }

    public int[] findnse(int[]arr){
        
        int n =  arr.length;
        int[] ans =  new int[n];
        Stack<Integer> ne  = new Stack<>();

        for(int i = n-1; i>=0;i--){
            while(!ne.isEmpty() &&arr[ne.peek()]>= arr[i] ){
                ne.pop();
            }

            ans[i] = ne.isEmpty() ? n : ne.peek();

            ne.push(i);

        }

        return ans; 

    } 


    public int[] findpse(int[]arr){
        int n =  arr.length;
        int[] ans =  new int[n];
        Stack<Integer> ne  = new Stack<>();

        for(int i = 0; i<n;i++){
            while(!ne.isEmpty() && arr[ne.peek()]> arr[i] ){
                ne.pop();
            }

            ans[i] = ne.isEmpty() ? -1 : ne.peek();

            ne.push(i);

        }

        return ans; 

    } 

}