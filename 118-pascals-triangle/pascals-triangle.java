class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<>();

       List<Integer> l1 = new ArrayList<>();

       l1.add(1);
       ans.add(l1);

       if(numRows ==1) {
        return ans;
       }
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);

        ans.add(l2);

        
       if(numRows == 2) {
        return ans;
       }

       for(int j = 3 ; j <= numRows ; j++){
         List<Integer> curr = new ArrayList<>();
         curr.add(1);
         for(int i = 0 ; i < l2.size()-1 ; i++ ){
            curr.add(l2.get(i) + l2.get(i+1) );

         }
         curr.add(1);
         ans.add(curr);
         l2 = curr;

       }


       return ans;
    }
}