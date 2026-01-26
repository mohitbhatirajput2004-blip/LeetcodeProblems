class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        
        if(arr.length == 2){
            l1.add(arr[0]);
            l1.add(arr[1]);
            ans.add(l1);
            return ans;
        }
        int mindiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length-1 ; i++ ){
            int diff = arr[i+1]- arr[i];
            mindiff = Math.min(diff , mindiff);
        }

         for(int i = 0 ; i < arr.length-1 ; i++ ){
            List<Integer> l = new ArrayList<>();
            if(arr[i+1] - arr[i] <= mindiff ){
                l.add(arr[i]);
                l.add(arr[i+1]);
                ans.add(l);
            }
        }
        return ans;
    }
}