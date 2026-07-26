class Solution {
    static boolean issafe(int row, int col, int m, char[][]nig){

        for(int i=0;i<row;i++){
            if(nig[i][col]=='Q') return false;
        }
        for(int i=row, j=col;i>=0&&j>=0;i--,j--){
            if(nig[i][j]=='Q') return false;
        }
       for(int i=row, j=col;i>=0&&j<m;i--,j++){
            if(nig[i][j]=='Q') return false;
        }

        return true;

       }
    
    public static void solved( int m, List<List<String>> ans, char [][] board ,int row){
        if(row==m){

            List<String> temp = new ArrayList<>();

            for(int i = 0;i<m;i++){
                temp.add(new String(board[i]));
            }
            ans.add(new ArrayList<>(temp));


            return;
            
        }
        for(int col = 0; col<m;col++){
            if(issafe(row,col, m, board)){
                board[row][col]='Q';
                solved(m, ans, board, row+1);
                board[row][col]='.';


            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char [][] wtv = new char[n][n];
        for(char[] row : wtv){
            Arrays.fill(row,'.');
        }
       
        List<List<String>> ans = new ArrayList<>();
        solved(n, ans,wtv, 0);
        return ans;
        
    }
}
