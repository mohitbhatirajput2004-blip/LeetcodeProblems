class Solution {
    public long minCost(String s, int[] cost) {
        Map<Character, Long> map =new HashMap<>();
        long sum=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),(long)0)+cost[i]);
            sum+=cost[i];
        }
        long min=Long.MAX_VALUE;
        for(char ch:map.keySet()){
            min=Math.min(min,sum-map.get(ch));
        }
        return min; 
    }
}