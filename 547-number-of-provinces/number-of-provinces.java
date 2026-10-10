class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> ads = new ArrayList<>();

        for(int i=0;i<n ;i++){
            ads.add(new ArrayList<>());
        }

        for(int k=0 ; k<n; k++){
            for(int j=0;j<isConnected[0].length; j++){
                if(isConnected[k][j]==1){
                    ads.get(k).add(j);
                }

            }
        }

        boolean[] v = new boolean[n+1];

        List<Integer> ne = new ArrayList<>();

        // v[0]=true;
        int cnt =0;

        for(int l=0;l<n;l++){
            if(v[l]==false){
                cnt++;
                dfs(l,v,ne,ads);
            }
        }

        return cnt;



        
    }

    public void dfs(int node, boolean[] v, List<Integer> ne, ArrayList<ArrayList<Integer>> ads ){
        v[node]=true;
        ne.add(node);


        for(Integer it: ads.get(node)){
            if(v[it]==false){
                dfs(it,v,ne,ads);
               
            }
        }
    }
}