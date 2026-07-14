class Solution {
    static int gihh(int[][] arr, int n, int mid){
        int max=-1;
        int in=-1;
        for(int i= 0;i<n ;i++){
            if(arr[i][mid]>max){
                max= arr[i][mid];
                in=i;
            }
        }
        return in;

    }
    public int[] findPeakGrid(int[][] mat) {
        int n= mat.length;
        int m = mat[0].length;
        int low = 0 ;
        int high = m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int max= gihh(mat, n ,mid);
            int left= mid-1>=0 ? mat[max][mid-1] : Integer.MIN_VALUE;
            int right = mid+1<m ? mat[max][mid+1] : Integer.MIN_VALUE;
            if(mat[max][mid]>left && mat[max][mid]>right){
                return new int[]{max,mid};
            }
            else if(left> mat[max][mid]) high = mid-1;
            else low = mid+1;
        }
        return new int[]{-1,-1};
        
    }
}