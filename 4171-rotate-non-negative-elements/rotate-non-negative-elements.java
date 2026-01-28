class Solution {
    public int[] rotateElements(int[] nums, int k) {
        // Step 1: collect non-negative elements
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

        // Step 2: rotate the array 'posa'
        if(count == 0) return nums;
        k = k % count; // handle cases where k > count
         reverse(posa, 0, k - 1);

        // Step 2: reverse remaining n-k elements
        reverse(posa, k, count - 1);

        // Step 3: reverse whole array
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

    // Helper function to reverse part of array
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