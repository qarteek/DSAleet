class Solution {
      static void getsets(int i, List<List<Integer>> ans, List<Integer> temp, int[] arr){
        // List<List<List<Integer>>> we = new ArrayList<>();
        if(i==arr.length){
            if(!ans.contains(temp)){
            
            ans.add(new ArrayList<>(temp));
            

        }
        return;
        }
        
        temp.add(arr[i]);
        
        getsets(i+1,ans, temp, arr );
        temp.remove(temp.size()-1);
        getsets(i+1,ans, temp, arr );
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ne = new ArrayList<>();
        getsets(0, ne, new ArrayList<>(), nums);
        return ne;
        
        
    }
}