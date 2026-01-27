class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        int newa[] = new int[2*n];

        for(int i = 0 ; i < nums.length ; i++){
            newa[i] = nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            newa[i + nums.length ] = nums[i];
        }
 for (int i = 0; i < nums.length; i++) {
            result[i] = -1; 
          
            
            for (int j = i+1; j < newa.length; j++) {
                if (nums[i] < newa[j]) {
                    result[i] = newa[j];
                    break;
                }
                
            }

        }


        return result;
    }
}