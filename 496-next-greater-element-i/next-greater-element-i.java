class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        HashMap<Integer , Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        HashMap<Integer , Integer> mapping = new HashMap<>();
         for(int i = 0;i< nums2.length ; i++ ) mapping.put(nums2[i] , i);
        for(int i =0 ; i < nums2.length ; i++){
            while(!s.isEmpty() && nums2[s.peek()] < nums2[i]){
                map.put(s.pop() , i);
            }
            s.push(i);
        }
    
        for(int i = 0; i< nums1.length ; i++){
            int x = mapping.get(nums1[i]);

            if(map.containsKey(x)){
            int ng = map.get(x);
            ans[i] = nums2[ng];
            }else{
                ans[i] = -1;
            }

        }

    return ans;
    }
}