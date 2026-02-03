class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int flag = 0; 
        for (int i = 0; i < n - 1; i++) {
            if (flag == 0) {
                if (nums[i] < nums[i + 1]) {
                } else if (i > 0 && nums[i] > nums[i + 1]) {
                    flag = 1;
                } else {
                    return false;
                }
            } else if (flag == 1) {
                if (nums[i] > nums[i + 1]) {
                   
                } else if (nums[i] < nums[i + 1]) {
                    flag = 2; // Reached valley
                } else {
                    return false;
                }
            } else if (flag == 2) {
                if (nums[i] < nums[i + 1]) {
                  
                } else {
                    return false;
                }
            }
        }
        return flag == 2;
    }
}