class Solution {
    public int lengthOfLastWord(String s) {
        
        int n = s.length();
        if(n == 0 ) return 0;
        if(n == 1 ) return 1;
        int cnt = 0;
        int end = n-1;

        while(end>0){
            if(s.charAt(end)==' '){
                end--;
            }
            else break;

        }

        while(end+1>0){
            if(Character.isLetter(s.charAt(end))){
                cnt++;
                end--;

            }
            else break;

            
        }

        return cnt;
    }
}