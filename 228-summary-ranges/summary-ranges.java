class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0 ; i <  nums.length ; i++){
            start = nums[i];

            while(i < nums.length -1 && nums[i+1]-nums[i] == 1  ){
                i++;

            }

            if(start == nums[i]){
                ans.add(""+start);
            }
            else{
                ans.add(start + "->" + nums[i]);
            }
        }
        return ans;
    }
}