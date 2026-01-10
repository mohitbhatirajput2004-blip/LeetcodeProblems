class Solution{
       public int numSubarraysWithSum(int[] nums, int goal){
        int sum = 0;
        int ans =0;
        int pre[] = new int [nums.length];
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0 ; i< nums.length ; i++){
           sum+=nums[i];
          ans +=map.getOrDefault(sum - goal , 0);

          map.put(sum , map.getOrDefault(sum , 0)+1);

            
        }
return ans;
       }
}