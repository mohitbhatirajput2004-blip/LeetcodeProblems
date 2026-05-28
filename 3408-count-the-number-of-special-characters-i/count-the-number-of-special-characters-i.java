class Solution {
    public int numberOfSpecialChars(String word) {

       HashSet<Character > hs = new HashSet(); 
       int ans=0;
       for(Character ch : word.toCharArray()){
        if(Character.isLowerCase(ch)){
            hs.add(ch);
        }

       }

        for(Character ch : word.toCharArray()){
            if(Character.isUpperCase(ch)){
               if(hs.contains(Character.toLowerCase(ch))){
                ans++;
                hs.remove(Character.toLowerCase(ch));
               }
            }
        }
        return ans;
    }
}