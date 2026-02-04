class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
      
        int count =  citations.length;
        for(int i=0; i< citations.length ; i++){
         if(citations[i] >= count - i){
            return count-i;
         }    
        }

        return 0;
    }
}