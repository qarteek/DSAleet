class Solution {

    Set<Integer> st = new HashSet<>();

    int solve(String no, boolean[] used, int[] digits) {

        if (no.length() == 3) {

            if (no.charAt(0) == '0') {
                return 0;
            }

            int ns = Integer.parseInt(no);

            if (ns % 2 == 0 && !st.contains(ns)) {
                st.add(ns);
                return 1;
            }

            return 0;
        }

        int ans = 0;

        for (int i = 0; i < digits.length; i++) {

            if (!used[i]) {

                used[i] = true;

                no += digits[i];

                ans += solve(no, used, digits);

                no = no.substring(0, no.length() - 1);

                used[i] = false;
            }
        }

        return ans;
    }

    public int totalNumbers(int[] digits) {

        int n = digits.length;

        boolean[] used = new boolean[n];

        return solve("", used, digits);
    }
}