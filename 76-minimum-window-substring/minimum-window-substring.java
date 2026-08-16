class Solution {
    public String minWindow(String s, String t) {
        int m =  s.length();
        int n = t.length();
        if(n>m) return "";
        int [] freq =  new int[126];

        for(int to = 0 ; to<n ; to++){
            freq[t.charAt(to)]++;
        }

        int l = 0;int r = 0;

        int strat = 0;
        int c = n;
        int min =2100000;
        String ans = "";
        while(r<m){

            if(freq[s.charAt(r)]>0){
                c--;
            }
            freq[s.charAt(r)]--;
            r++;
            while(c==0){
               if(r-l<min){
                min = r-l;
                ans = s.substring(l , r );
               }

              if(freq[s.charAt(l)]==0){
                c++;
              }
              freq[s.charAt(l)]++;
              l++;
            }

           
        }
        return ans ;


      
   



        
    }
}