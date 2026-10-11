class Solution {
    int n = 0;
    int m = 0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        n = image.length;
        m = image[0].length;

        int k = image[sr][sc];

         if (k == color) {
            return image;
        }

        dfs(sr, sc, color, image,k);

        return image;
    }

    public void dfs(int sr, int sc , int color, int[][] image, int k){
        if(sr>=n || sr <0 || sc>=m || sc<0){
            return;
        }

        if(k!=image[sr][sc]){
            return;
        }

        image[sr][sc]=color;

        dfs(sr-1,sc, color, image, k );
        dfs(sr,sc+1, color, image, k );
        dfs(sr+1,sc, color, image, k );
        dfs(sr,sc-1, color, image, k );

    
    }
}