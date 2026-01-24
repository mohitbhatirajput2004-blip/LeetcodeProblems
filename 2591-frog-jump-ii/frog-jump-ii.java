class Solution {

    public int maxJump(int[] stones) {
        int max= Integer.MIN_VALUE;

        if(stones.length == 2) return stones[1] - stones[0];
        for(int i=0; i < stones.length - 2  ; i++){
         int ans = (stones[i+2] - stones[i]);
        max = Math.max(max , ans);

       }
       return max;

    }
}