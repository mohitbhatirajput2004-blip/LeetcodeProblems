class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n= nums.length;
        int res[] = new int[n];
        int idx = 0 ;
        for(int i = 0 ; i < n ; i++ ){
           
               idx = ((nums[i] + i )% n + n ) %n;

               res[i] = nums[idx];
            }
          return res;
        }


        
    
}