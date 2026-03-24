class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer , Integer > mp = new HashMap<>(); 
        for(int x : nums){
            mp.put(x ,mp.getOrDefault(x, 0)+1 );
        }
        int ans =0 ;
        for(Map.Entry<Integer,Integer> x : mp.entrySet()){
            if(k > 0 && mp.containsKey(x.getKey()+k)){
                ans++;
            }
            if(k==0 && x.getValue()>1){
                ans++;
            }
        }
        return ans;
    }
}