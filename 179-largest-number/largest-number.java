class Solution {
    public String largestNumber(int[] nums) {

        String str="";
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                String s=String.valueOf(nums[i])+String.valueOf(nums[j]);
                String s1=String.valueOf(nums[j])+String.valueOf(nums[i]);
                
               if(s1.compareTo(s)>0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                }

            }
        }
        if(nums[0]==0) return "0";
        for(int i=0;i<nums.length;i++){
            str+=String.valueOf(nums[i]);
        }
     return str;
      
    }
}