class Solution {

    static String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0)
            return ans;

        backtrack(0, digits, new StringBuilder(), ans);

        return ans;
    }

    static void backtrack(int index, String digits,
                          StringBuilder temp,
                          List<String> ans) {

        if (index == digits.length()) {
            ans.add(temp.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            temp.append(letters.charAt(i));

            backtrack(index + 1, digits, temp, ans);

            temp.deleteCharAt(temp.length() - 1);
        }
    }
}