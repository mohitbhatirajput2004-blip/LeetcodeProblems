class Solution {
    public String largestEven(String s) {
        int n = s.length()-1 ;
        String ans = "";
        int index = -1;
       
       for(int i = 0 ; i <= n ; i++){
        char ch = s.charAt(i);
        if( ch == '2'){
            index = i;
        }
       }
      
       if(index == -1) return "";

        return s.substring(0,index+1);
    }
}