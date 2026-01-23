class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
 Arrays.sort(towers, (p1, p2) -> {
            if (p1[0] != p2[0]) return p1[0] - p2[0];
            return p1[1] - p2[1];
        });
     int a  = center [ 0] ;
     int b = center[1];
     int ans[] = {-1,-1};
     int max = -1;


     for(int i = 0 ; i<towers.length ; i++){
        int val1 = towers[i][0];
        int val2 =  towers[i][1];


        if(Math.abs(val1 - a) + Math.abs(val2-b) <= radius ){
            if(towers[i][2] > max ){
                ans[0] = val1;
                ans[1] = val2;
                max = towers[i][2];
            }
        }
     }
     return ans;

    }
}