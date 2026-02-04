class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = Integer.MIN_VALUE;
        for(int num : nums){
            set.add(num);
        }
        

        for(int num : set){
           int count =0;
            if(!set.contains(num-1)){
                count=1;
                int n =  num ;
                while(set.contains(n+1)){
                    count++;
                    n++;
                }
                ans = Math.max(ans , count);
            }
        }

        return ans == Integer.MIN_VALUE ? 0 : ans;
    }
}