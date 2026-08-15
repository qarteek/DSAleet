class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return max(nums , k) - max(nums, k-1);
        
    }
    public int max(int[] arr ,  int k){
        if(k<0) return 0;
        int cnt = 0;
        int l = 0;
        int r = 0;
        int sum = 0;

        while(r<arr.length){

           if(arr[r]%2!=0) k--;

            while(k<0){
                if(arr[l]%2!=0) k++;
                l++;
            
            }

            cnt  += r - l +1;
            r++;
            
            }
    

              return cnt;

        }

    }