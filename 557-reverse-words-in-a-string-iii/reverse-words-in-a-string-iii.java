class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        int n = arr.length;

        for(int i=0 ; i<n ; i++){

            String rev = "";

            for(int j = arr[i].length() - 1 ; j >=0 ;j-- ){
                rev += arr[i].charAt(j);
            }
            arr[i] = rev;
        }

        String ans= "";

         for(int i=0 ; i<n ; i++){
          ans +=  arr[i] + " ";
         }


        return ans.trim();
    }
}