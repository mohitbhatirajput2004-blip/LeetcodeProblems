class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        boolean[] visit = new boolean[n + 1];
        for (int i : nums) {
            visit[i] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}