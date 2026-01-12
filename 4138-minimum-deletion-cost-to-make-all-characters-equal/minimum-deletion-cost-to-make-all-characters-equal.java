class Solution {
    public long minCost(String s, int[] cost) {
        long[] arr= new long[26];
        long m=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=cost[i];
        }   
        for(long i:arr){
            if(i>m){
                m=i;
            }
            sum+=i;
        }
        return sum-m;
    }
}