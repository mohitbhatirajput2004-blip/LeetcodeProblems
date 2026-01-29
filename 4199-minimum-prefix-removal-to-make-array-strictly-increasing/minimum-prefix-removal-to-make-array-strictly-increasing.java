class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
              
                ans = i + 1;
            }
        }

        return ans;
    }
}