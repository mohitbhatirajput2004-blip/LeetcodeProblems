import java.util.Vector;
class Solution {
    public String reverseVowels(String s) {
        Vector<Character> v = new Vector<>();
        int count=0;
        for(int i = 0 ; i < s.length() ; i++ ){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || 
            s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'o' ||
             s.charAt(i) == 'U' || s.charAt(i) == 'u' ){
                count++;
                v.add(s.charAt(i));
             }
        }
          int x =  count-1;
          String ans = "";
       for(int i = 0 ; i < s.length() ; i++ ){
      
            if(s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || 
            s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'o' ||
             s.charAt(i) == 'U' || s.charAt(i) == 'u' ){
              ans += v.get(x);
               x--;
             }
             else{
                ans += s.charAt(i);
             }
        }

        return ans;
    }
}