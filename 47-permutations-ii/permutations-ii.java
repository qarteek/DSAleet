class Solution {

    static void getperm(int[] arr, int i, List<List<Integer>> ind){
        Set<Integer> ne = new HashSet<>();
        if(i == arr.length) {
           

            List<Integer> current = new ArrayList<>();

            for (int num : arr) {
                current.add(num);
            }

            ind.add(current);
            return;
            }

        for(int k = i;k<arr.length;k++){
            if(ne.contains(arr[k])) continue;

            ne.add(arr[k]);

            swap(arr,i,k);
            getperm(arr, i+1, ind);
            swap(arr, i , k);

        }
        
    }
    
    static void swap(int[]arr, int i, int k){
        int temp =arr [i];
        arr[i] = arr[k];
        arr[k] = temp;
    
    }



    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>> ne = new ArrayList<>();
     
     
       getperm(nums, 0, ne);
       return ne;
    }
}