class Solution {
    public int[] rotateElements(int[] nums, int k) {
      
        int count = 0;
        for (int num : nums) {
            if (num >= 0) count++;
        }

        int[] posa = new int[count];
        int x = 0;
        for (int num : nums) {
            if (num >= 0) {
                posa[x++] = num;
            }
        }
        int n=nums.length;

        
        if(count == 0) return nums;
        k = k % count; 
         reverse(posa, 0, k - 1);

      
        reverse(posa, k, count - 1);

       
        reverse(posa, 0, count - 1);

        x =0 ;

for(int i = 0 ; i < nums.length ; i++){
        if(nums[i] >= 0 ){
            nums[i] = posa[x];
            x++;
        }

    }    
    
    return nums;
    }

  
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
