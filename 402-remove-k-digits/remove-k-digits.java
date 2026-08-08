class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> ne = new ArrayDeque<>();
        int n= num.length();

        for(int i = 0 ; i < n ; i++){
            char dig = num.charAt(i);

            while(!ne.isEmpty() && k> 0 && ne.peekLast() > dig ){
                ne.removeLast();
                k--;
            }

            ne.addLast(dig);

        }

        while(k>0){

            ne.removeLast();
            k--;

        }

        while(!ne.isEmpty() && ne.peekFirst() == '0' ){
            ne.removeFirst();

        }
        if(ne.isEmpty()) return "0";

        StringBuilder kar =  new StringBuilder();

        while(!ne.isEmpty() ){
            kar.append(ne.pollFirst());
        }
        
        if(kar.length()==0) return "0";

        return kar.toString();

    }
}