class Solution {
  static boolean newday(int[] arr, int day, int m, int k){
    int cnt=0, days=0;
    for(int i=0; i< arr.length; i++){
        if(arr[i]<=day){
            cnt++;
        }
        else{
            days+=cnt/k;
            cnt=0;
        }          
    }  
     days+=cnt/k;

        if(days>=m){
            return true ;
        }
        return false ;
 }

    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;
   int low= Arrays.stream(bloomDay).min().getAsInt();
   int high =Arrays.stream(bloomDay).max().getAsInt();
   int result = -1;

    while(low<=high){
        int mid=(low+high)/2;
        // int new= ;
        if(newday(bloomDay, mid, m, k)){
            result = mid; 
            high = mid-1;
        }
        else low=mid+1;
    }
    return result;

    }
}