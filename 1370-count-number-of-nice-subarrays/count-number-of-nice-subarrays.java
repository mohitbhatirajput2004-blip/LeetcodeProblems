class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int count = 0, start = 0, ans = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] % 2 == 1) k--;   // reduce k when we see an odd
            while (k < 0) {                // shrink window until valid
                if (nums[start] % 2 == 1) k++;
                start++;
            }
            ans += end - start + 1;        // all subarrays ending at 'end'
        }
        return ans;
    }
}