class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;

        for(int i = 0 ;i<points.length -1; i++){
           int s1 = points[i][0] ;
           int s2 = points[i][1] ;

           int n1 = points[i+1][0];
           int n2 = points[i+1][1];

           while( s1 != n1 || s2 != n2){

            if(n1 > s1){
                s1 ++;
            }
             if(n1 < s1){
                s1 --;
            }
             if(n2 > s2){
                s2 ++;
            }
             if(n2 < s2){
                s2 --;
            }
            time++;
           }

        }
        return time;
    }
}