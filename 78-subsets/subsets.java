class Solution {
    static void bozo(int i, List<List<Integer>> ans, List<Integer> temp, int[] arr){
        if(i==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        bozo(i+1,ans, temp, arr );
        temp.remove(temp.size()-1);
        bozo(i+1,ans, temp, arr );
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bozo(0, ans, new ArrayList<>(), nums);
        
        return ans;
    }
}