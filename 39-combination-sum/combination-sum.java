class Solution {
    public static void getcombi(int in,int  target,List<List<Integer>> dev,int[] arr, List<Integer> temp){
        if(in==arr.length){
            if(target==0){
                dev.add(new ArrayList<>(temp));
                
            }
            return;
        }


        if(arr[in]<= target){
            temp.add(arr[in]);
            getcombi(in, target - arr[in], dev, arr, temp);
            temp.remove(temp.size()-1);
        }
         getcombi(in + 1,target, dev, arr, temp);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> dev = new ArrayList<>();
        getcombi(0, target, dev, candidates, new ArrayList<>());
        return dev;

        
    }
}