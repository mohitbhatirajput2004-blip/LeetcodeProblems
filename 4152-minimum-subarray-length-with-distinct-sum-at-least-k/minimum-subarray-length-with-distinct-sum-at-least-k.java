import java.util.*;

class Solution {
    public int minLength(int[] nums, int k) {
        int a = 0;              // right pointer
        int b = 0;              // left pointer
        int sum = 0;            // distinct sum
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        while (a < n) {
            int val = nums[a];
            map.put(val, map.getOrDefault(val, 0) + 1);
            if (map.get(val) == 1) { // first occurrence
                sum += val;
            }

            // shrink window while condition satisfied
            while (sum >= k) {
                min = Math.min(min, a - b + 1);
                int removeVal = nums[b];
                map.put(removeVal, map.get(removeVal) - 1);
                if (map.get(removeVal) == 0) {
                    sum -= removeVal;
                }
                b++;
            }
            a++;
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}