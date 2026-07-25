class Solution {
    static void doer(int i, List<List<String>> ans, List<String> temp, String s){
        int n = s.length();
        if(i==n){
            ans.add(new ArrayList<>(temp));

            return;
        }
        for(int k = i; k<n;k++){
            if(palim(s, i, k)){
                temp.add(s.substring(i, k+1));
                doer(k+1, ans, temp, s);
                temp.remove(temp.size()-1);

            }
        }




    }
    static boolean palim(String s,int start, int end ){
        while(start<end){
        if(s.charAt(start)!=s.charAt(end)){
            return false;
            
        }
        else {
            start++;
            end--;
        }
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        doer(0, res, new ArrayList<>(),s);
        return res;
    }
}