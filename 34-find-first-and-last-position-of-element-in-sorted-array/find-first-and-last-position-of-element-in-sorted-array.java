class Solution {
    public int[] searchRange(int[] arr, int x) {
        
        int []ans= {-1,-1};
        int n=arr.length;
        int low = 0, high = n - 1;
        // int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                ans[0] = mid;     // Potential floor
                high=mid-1;
            } else if(arr[mid]<x) {
                low = mid + 1;
            }
            else {
                high=mid-1;
                
            }
        }

         int low1 = 0, high2 = arr.length - 1;
        int ans2 = -1;

        while (low1 <= high2) {
            int mid = (low1 + high2) / 2;
            if (arr[mid] == x) {
                ans[1] = mid;     // Potential ceil
               low1 = mid + 1;
            } else if(arr[mid]>x) {
                high2 = mid - 1;
            }
            //right = mid -1
            else{low1 = mid + 1; }
        }
         return ans;
      
    }
}