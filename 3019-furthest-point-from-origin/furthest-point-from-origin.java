class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0 ;
        int right = 0;

        int arr[] = new int[2];
        for(int i = 0 ; i<moves.length();i++ ){

            if(moves.charAt(i) == 'L'){
                arr[0] +=1;

            }
            else if(moves.charAt(i) == 'R'){
                arr[1] +=1;
            }
        }

        for(int i = 0 ; i<moves.length();i++ ){
            if(moves.charAt(i) == 'L' ){
            left += 1;
                }
             else if(moves.charAt(i) == 'R' ){
                right +=1;
             }
             else{
                if(arr[0] > arr[1]){
                    left++;
                }
                else{
                    right++;
                }
             }
        }

        return Math.abs(left - right);
    }
}