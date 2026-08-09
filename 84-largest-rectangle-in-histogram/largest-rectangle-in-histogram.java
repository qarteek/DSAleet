class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> ne = new Stack<>();
        int n = heights.length;
        int max = 0;

        for(int i = 0; i < n; i++){
            while(!ne.isEmpty() && heights[ne.peek()] > heights[i]){
               int k =  heights[ne.pop()];

               int l = ne.isEmpty() ? -1 : ne.peek();

                max = Math.max(max , k*(i - l -1) );
            }


            ne.push(i);


        }

         while(!ne.isEmpty()){
               int k =  heights[ne.pop()];

               int l = ne.isEmpty() ? -1 : ne.peek();

                max = Math.max(max , k*(n - l -1) );
            }

            

            

        

        

        return max;
        
    }
}