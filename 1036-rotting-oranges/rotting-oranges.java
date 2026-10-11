class Solution {


    public int orangesRotting(int[][] grid) {


        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        int minutes = 0;

        Queue<int[]> ne  = new LinkedList<>();

        for(int i = 0; i < n ; i++){
            for(int k = 0; k < m; k++){
                if(grid[i][k]==2){
                    ne.offer(new int[]{i, k});
                }else if(grid[i][k]==1) fresh++;
                
            }
        }


            int[][] dir = {
                {-1,0}, {0,+1 }, {+1 , 0 }, {0,-1}
            };
            

            while(!ne.isEmpty() && fresh>0){

                int s = ne.size();

                for(int l= 0 ;l< s;l++){
                int [] kar = ne.poll();
                int r = kar[0];
                int c = kar[1];
            

                for(int[] it : dir){


                     int nr = r+ it[0];
                     int nc = c+ it[1];
                     

                     if(nr>=0 && nr< n && nc>=0 && nc<m && grid[nr][nc]==1){
                grid[nr][nc]=2;
                fresh--;
                ne.offer(new int[]{nr,nc});
               }
                     

                

               }

               
            }
             minutes++;

        }

        if(fresh>0){
            return -1;
        }
       

        


        
    return minutes;


    }
}