class Solution {
    public String reversePrefix(String s, int k) {
       
        if(k==1 ) return s;

        String rem = s.substring(k , s.length());

        String rev = s.substring(0,k);

        String ans = "";
        for(int i = rev.length()-1  ; i>=0 ; i--){
            ans += s.charAt(i);
        }

        return ans+rem;
    }
}