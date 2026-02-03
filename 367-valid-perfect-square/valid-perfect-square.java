class Solution {
    public boolean isPerfectSquare(int num) {
       long s  = 1;
       long e = num;

       while(s<=e){
        long mid = s + (e-s) / 2;
        
        if(mid*mid >= num){
            e = mid-1;

        }
        else{
            s= mid+1;
        }
       } 

      if(s*s ==  num ){
        return true;
      }
      return false;
    }
}