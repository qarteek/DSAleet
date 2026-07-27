class Solution {

    Boolean[] memo;

    public boolean check(Set<String> dict, int n, int start, String s) {
        if (start == n) return true;

        if (memo[start] != null)
            return memo[start];

        for (int i = start + 1; i <= n; i++) {
            String part = s.substring(start, i);

            if (dict.contains(part) && check(dict, n, i, s)) {
                return memo[start] = true;
            }
        }

        return memo[start] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();

        Set<String> dict = new HashSet<>(wordDict);
        memo = new Boolean[n];

        return check(dict, n, 0, s);
    }
}
