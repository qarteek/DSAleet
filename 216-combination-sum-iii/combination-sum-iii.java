class Solution {
    static void getsolution(int l,int k, int n ,List<List<Integer>> ans, List<Integer> temp ){
        if(temp.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int s = l; s<=9;s++ ){
            temp.add(s);
            getsolution(s+1, k, n-s, ans, temp);
            temp.remove(temp.size()-1);
        }
        

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> cot = new ArrayList<>();
        getsolution(1, k, n, cot, new ArrayList<>());
        return cot;

        
    }
}