class Solution {
    public String convert(String s, int numRows) {
        String[] arr =  new String[numRows];
        for(int i = 0 ; i < numRows; i++){
            arr[i]="";

        }

        int i = 0;
        while(i< s.length()){
            for(int ind = 0 ; ind < numRows && i< s.length() ; ind++){
                arr[ind]+=s.charAt(i++);

            }
            for(int ind = numRows-2 ; ind>0 && i<s.length() ;ind--){
                arr[ind]+=s.charAt(i++);
            }

        }
        String ne ="";

        for(String nek : arr){
            ne+=nek;
        }
        return ne;
        
    }
}