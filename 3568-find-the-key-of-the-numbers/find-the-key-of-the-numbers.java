class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String one = String.format("%04d", num1);
        String two = String.format("%04d", num2);
        String three = String.format("%04d", num3);

        StringBuilder k = new StringBuilder();

        int i = 0;

        while(i<one.length()){
           k.append(Math.min(Math.min(one.charAt(i) - '0', two.charAt(i) - '0'),three.charAt(i)-'0' ));
            i++;
        }
        return Integer.parseInt(k.toString());
    }
}