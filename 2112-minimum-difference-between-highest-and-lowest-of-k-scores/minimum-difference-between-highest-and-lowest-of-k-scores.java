class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length ==  1) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=nums.length -k ; i++){
          int ans = nums[i+k-1] - nums[i];
          min = Math.min(min , ans);
        }

        return min;
        
    }
}