class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast =sq(n);

        while(slow!=fast){
            slow = sq(slow);
            fast = sq(sq(fast));

            


        }

        return slow==1;


        
    }
    static int sq(int num){
        int ans = 0;
        while(num>0){
            int remainder = num%10;
            ans+= remainder*remainder;
            num/=10;
        }

        return ans;
    }
}