class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        for(int i =0 ;i<n;i++){
            num1[m+i]=num2[i];
        }
        int len = n+m;
        int gap = len/2+len%2; 
        while(gap>0){
            int left =0;
            int right = left + gap;
            while(right<len){
                if(num1[left]>num1[right])
            {
                    int temp= num1[left];
                    num1[left]=num1[right];
                    num1[right]=temp;


                }
                left++;right++;
            }
            if(gap==1)break;
            gap=gap/2+gap%2;

        }
        


        
        
    }
}