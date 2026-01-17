class Solution {
    public int residuePrefixes(String s) {
       Set<Character> distinct = new HashSet<>();
        int residueCount = 0;

        for (int i = 0; i < s.length(); i++) {
            distinct.add(s.charAt(i));
            int prefixLength = i + 1;
            if (distinct.size() == prefixLength % 3) {
                residueCount++;
            }
        }
        return residueCount;

    }
}