class Solution {
    public int minOperations(int[] nums, int[] target) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
         
                if(nums[i] != target[i] && !set.contains(nums[i])){
                  ans++;
                  set.add(nums[i]);
                }
                
            
           
        }
        return ans;
    }
}
