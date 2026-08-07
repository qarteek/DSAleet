class Solution {
    public int sumSubarrayMins(int[] arr) {

        int[] nse= findnse(arr);
        int[] pse= findpse(arr);

        int total = 0;
        int mod = (int)1e9+7;

        for(int i = 0;i < arr.length; i++){
            int front = i - pse[i];
            int back = nse[i]-i;

            total = (int)((total+ (front * back *1l * arr[i])% mod)%mod);
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