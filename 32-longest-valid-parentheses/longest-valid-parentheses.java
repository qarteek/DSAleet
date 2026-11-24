class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> so  = new Stack<>();
        so.push(-1);
        int maxlen = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                so.push(i);
            }
            else{
                so.pop();
                if(so.isEmpty()){
                    so.push(i);
                }
                else {
                    maxlen = Math.max(maxlen, i -so.peek());
                }
            }

            

        }

        return maxlen;
        
    }
}