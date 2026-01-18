import java.util.*;

class Solution {
    public int minLength(int[] nums, int k) {
        int a = 0;              
        int b = 0;              
        int sum = 0;       
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        while (a < n) { 
            map.put(nums[a], map.getOrDefault(nums[a], 0) + 1);

            if (map.get(nums[a]) == 1) { 
                sum += nums[a];
            }

            while ( b <= a && sum >= k) {
                min = Math.min(min, a - b + 1);
                
                map.put(nums[b], map.get(nums[b]) - 1);
                if (map.get(nums[b]) == 0) {
                    sum -= nums[b];
                }
                b++;
            }
            a++;
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}