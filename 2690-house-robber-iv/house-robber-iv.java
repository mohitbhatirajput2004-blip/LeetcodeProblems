class Solution {
    public int minCapability(int[] nums, int k) {
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        int ans =0;

        for(int i = 0;i< nums.length ; i++ ){
            max = Math.max(max , nums[i]);
            min = Math.min(min , nums[i]);
        }
        if(k==1) return min;
        int s = min;
        int e = max;
        
        while(s<=e){
            int mid = s + (e-s) /2;

            if(check(nums , mid,k)){
                ans = mid;
                e = mid-1;
            }
            else{
                s=mid+1;
            }
        }
   return ans;
    }

    boolean check(int arr[] , int mid , int k){
        int count = 0;
        for(int i = 0 ; i<arr.length ; ){
            if(arr[i] <= mid){
                i+=2;
                count++;
            }
            else{
                i++;
            }
        }
        if(count >= k){
            return true;
        }
        return false;
    }
}