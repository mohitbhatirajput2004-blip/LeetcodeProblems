class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i = 0, j = 0;
        int cost = 0, max = 0;

        while (j < s.length()) {
            cost += Math.abs(s.charAt(j) - t.charAt(j));

            while (i <= j && cost > maxCost) {
                cost -= Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }
}