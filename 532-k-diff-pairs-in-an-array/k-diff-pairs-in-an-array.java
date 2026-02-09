class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int a : nums) {
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }
        
        int ans = 0;
        for (Map.Entry<Integer, Integer> a : mp.entrySet()) {
            if ((k > 0 && mp.containsKey(k + a.getKey())) || (k == 0 && a.getValue() > 1)) {
                ans++;
            }
        }
        return ans;
    }
}