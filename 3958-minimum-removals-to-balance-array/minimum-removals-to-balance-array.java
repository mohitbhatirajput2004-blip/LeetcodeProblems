class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
       
        int i = 0;
        int maxLen = 0;
        int ans = 0;

        for (int j = 0; j < n; j++) {
           
            while ((long) nums[j] > (long) nums[i] * k) {
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }

        ans = n - maxLen;
        return ans;
    }
}