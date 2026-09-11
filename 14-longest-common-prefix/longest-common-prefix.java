class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1= strs[0];
        String s2 = strs[strs.length-1];
        int i =0;
        StringBuilder ans =new StringBuilder();
        while(i<s1.length() && i< s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                ans.append(s1.charAt(i));
                i++;

            }
            else break;
        }

        return ans.toString();
        

        
    }
}