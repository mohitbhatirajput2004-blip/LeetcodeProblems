class Solution {
    public List<String> printVertically(String s) {
        String[] arr = s.split(" ");
        int mlen = 0;
        
       
        for (String word : arr) {
            mlen = Math.max(mlen, word.length());
        }
        
        List<String> rs = new ArrayList<>();
        
       
        for (int x = 0; x < mlen; x++) {
            StringBuilder sb = new StringBuilder();
            
            for (String ss : arr) {
                if (x < ss.length()) {
                    sb.append(ss.charAt(x));
                } else {
                    sb.append(" ");
                }
            }

    
            
          
            rs.add(sb.toString().replaceAll("\\s+$", ""));
        }
        
        return rs;
    }
}