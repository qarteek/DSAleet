class Solution {
    public int[] rearrangeArray(int[] arr) {

         List<Integer> li= new ArrayList<>();
         List<Integer> li2= new ArrayList<>();

   
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                li.add(arr[i]);
            }
            else li2.add(arr[i] );

        }
        for(int i=0;i<arr.length/2;i++){
            arr[2*i]=li2.get(i);
            arr[2*i+1]= li.get(i);
        }
        return arr;
        
    }
}