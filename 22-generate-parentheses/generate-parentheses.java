class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans  = new ArrayList<>();

        backtrack(n, 0, 0,"",  ans);

        return ans;
        
        
    }

    public void backtrack(int n, int l, int r,String say, List<String> temp ){

        if(say.length()== n* 2){
            temp.add(say);
            return;
        }

        if(l<n){
            backtrack(n, l+1,r, say + "(", temp);

        }

        if (r<l){
            backtrack(n, l, r+1, say + ")", temp);
        }

    }
}