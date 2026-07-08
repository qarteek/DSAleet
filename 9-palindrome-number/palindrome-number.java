class Solution {
    public boolean isPalindrome(int num) {
        int reversed = 0;
        int v=num;
        if(num<0){
        return false;
        }

        while (num != 0) {
            // Extract the last digit
            int digit = num % 10;
            // Append the digit to the reversed number
            reversed = reversed * 10 + digit;
            // Remove the last digit from the original number
            num /= 10;
        }
        return v== reversed;
        
        
    }
}