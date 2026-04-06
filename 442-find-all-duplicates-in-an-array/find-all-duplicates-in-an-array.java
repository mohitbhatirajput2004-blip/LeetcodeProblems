class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i : nums){
            if(mp.containsKey(i)){
                ans.add(i);
            }
            else{
                mp.put(i,1);
            }
        }
        return ans;
    }
}