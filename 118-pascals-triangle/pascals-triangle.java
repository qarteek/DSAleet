class Solution {

    public static List<Integer> rowsans(int row){
         int an=1;
        List<Integer> ans= new ArrayList<>();
        ans.add(an);
        for(int i= 1;i<row;i++){

        an= an * (row-i);
        an= an/(i);
        ans.add(an);
        
       }
       return ans;
    }


    public List<List<Integer>> generate(int nrow) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=1;i<=nrow;i++){
            List<Integer> temp= new ArrayList<>();
            
            triangle.add(rowsans(i));

        }
        return triangle;

       
    }
}