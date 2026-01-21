class Solution {
    public int maxVowels(String s, int k) {

        int max = 0;
        int st = 0;
        int count =0;
        for(int i = 0 ; i<k ; i++){
        if( s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||      s.charAt(i) == 'o' ||    s.charAt(i) == 'u' ) 
          {
            count ++;
          } 
        }
        max = Math.max(max ,  count);

        for(int j = k ; j< s.length() ; j++){
           if( s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u'  ) 
          {
            count ++;
          } 

          if( s.charAt(st) == 'a' || s.charAt(st) == 'e' || s.charAt(st) == 'i' || s.charAt(st) == 'o' ||  s.charAt(st) == 'u'    ) 
          {
           count--;
          
          } 
          st++;
         max = Math.max(max ,  count);
    }

    return max;
}
}