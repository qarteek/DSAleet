class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for(int i = 0;i<n;i++){
            for(int j = 0 ; j < m;j++){
            if(board[i][j]==word.charAt(0)){
                if(dfs(i,j, board, word, 0 )){
                return true;
            }
            }
        }
        }
        return false;
    }

    static boolean dfs(int n, int m ,char[][] board, String s, int in){
        if(in==s.length()){
            return true;
        }

        if(n<0 || n>=board.length || m<0 || m>=board[0].length || board[n][m]!=s.charAt(in) || board[n][m]=='*') return false;

        char c = board[n][m];
        board[n][m]='*';

        boolean ne = dfs(n+1, m, board, s, in+1)|| dfs(n-1, m, board, s, in+1)||dfs(n, m+1, board, s, in+1)||dfs(n, m-1, board, s, in+1);
        board[n][m]=c;
        return ne;



        
    }
}