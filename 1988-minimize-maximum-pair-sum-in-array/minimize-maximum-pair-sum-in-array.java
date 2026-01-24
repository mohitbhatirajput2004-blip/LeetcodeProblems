class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int e = nums.length-1;
        int max =0;
        while(s<e){
            int ans = nums[s] + nums[e];
            max = Math.max(ans , max);
            s++;
            e--;
        }
        
    
    return max ;
    }
}