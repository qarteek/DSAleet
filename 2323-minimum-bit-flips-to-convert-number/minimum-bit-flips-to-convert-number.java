class Solution {
    public int minBitFlips(int start, int goal) {
        int num = start^goal;

        int ont = 0;

        for(int i = 0; i<32; i++){

            ont += num&1;

            num = num>>1; 
        }

        return ont;

        
        
    }
}