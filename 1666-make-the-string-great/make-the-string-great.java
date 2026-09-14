class Solution {
    public String makeGood(String s) {
        Stack<Character> ne = new Stack<>();

        for(int i = 0; i< s.length(); i++){
            if(!ne.isEmpty()&& Math.abs(s.charAt(i)- ne.peek())==32){
                ne.pop();

            }
            else {
                ne.push(s.charAt(i));
            }
        }

        String ke= "";

        while(!ne.isEmpty()){

            char kar = ne.pop();

            ke =kar + ke ;

        }
    
     return ke;

        
    }
}