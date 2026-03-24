class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int count = 1 ;

        char arr[] =  s.toCharArray();
             long totalShift = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            arr[i] = (char) ((arr[i] - 'a' + totalShift) % 26 + 'a');
        }

           
        String ans= "";
        for(char c : arr){
            ans+=c;
        }
        return ans;
    }
}