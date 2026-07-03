class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int b=arr[i];
            int rem = target-b;
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(b,i);

          
                
            }
            return new int[]{-1,-1};
        }
        
        
    }
