class Solution {
    static void getcombi2(int i , int tar, int[] arr,List<List<Integer>> ne, List<Integer> temp ){
       
            if(tar==0){
                ne.add(new ArrayList<>(temp));return;
            }
            
        
        for(int k=i;k<arr.length;k++){
            if(k>i && arr[k]==arr[k-1]) continue;
            if (arr[k] > tar) break;

            temp.add(arr[k]);
            getcombi2(k+1, tar -  arr[k], arr, ne, temp);
            temp.remove(temp.size()-1);


        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ne = new ArrayList<>();
        Arrays.sort(candidates);
        getcombi2(0, target, candidates, ne, new ArrayList<>());
        return ne;
        
    }
}