class Solution {
    public int numSubarraysWithSum(int[] num, int goal) {

        return max(num, goal) - max(num, goal-1);
        
    }

    public int max(int[] arr ,  int k){
        if(k<0) return 0;
        int cnt = 0;
        int l = 0;
        int r = 0;
        int sum = 0;

        while(r<arr.length){

            sum += arr[r];

            while(sum>k){
                sum-=arr[l];
                l++;
            
            }

            cnt  =  cnt + r - l +1;

            r++;
            

        }

        return cnt;

    }
}