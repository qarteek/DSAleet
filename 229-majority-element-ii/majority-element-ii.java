import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        int cnt=0;
        int cnt1=0;
        int el= Integer.MIN_VALUE;
        int el1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt==0 && nums[i]!=el1){
                cnt++;
                el=nums[i];
            }   
            else if(cnt1==0 &&nums[i]!=el ){
                cnt1=1;
                el1=nums[i];
            }
            else if(nums[i]==el){
                cnt++;
            }
            else if(nums[i]==el1){
                cnt1++;
            }
            else {
                cnt--;
                cnt1--;
            }
                                                     

        }
        List<Integer> li= new ArrayList<>();
        int cntt=0,cntt1=0;
        for(int i =0;i<n;i++){
            if (nums[i]==el) cntt++;
            if(nums[i]==el1) cntt1++;

                
            }
            int mini= n/3;
            if(cntt>mini) li.add(el);
            if(cntt1>mini) li.add(el1);
            li.sort(Comparator.naturalOrder()); 
           return li;  
        }
       
}
    
