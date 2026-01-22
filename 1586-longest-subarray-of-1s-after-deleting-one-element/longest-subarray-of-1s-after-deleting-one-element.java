class Solution {
    public int longestSubarray(int[] nums) {
        int j = 0;
        int start = 0 ;
        int sum = 0 ;
        int flag = 0 ;
        int max = Integer.MIN_VALUE;

        while(j < nums.length){
            if(nums[j] == 0){
                flag++;
            }
            
            while(flag > 1){
                if(nums[start] == 0) {
                    flag--;
                }
                sum -= nums[start]; 
                start ++;
            }
            sum += nums[j];
            max = Math.max(max ,   sum );
             j++;   
        }


        return max == nums.length ? --max : max ;
    }
}