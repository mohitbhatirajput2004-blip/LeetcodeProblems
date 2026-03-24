class Solution {
    public int findMinDifference(List<String> timePoints) {
      int diff  = Integer.MAX_VALUE;

      int time[] = new int[timePoints.size()]; 
      for(int i =0 ; i<timePoints.size() ; i++){
       
        String arr []= timePoints.get(i).split(":");
        

          int hr = Integer.parseInt(arr[0]);
          int min = Integer.parseInt(arr[1]);
           
            time[i] = hr*60 + min;
            if(time[i] == 0 ){
                time[i] = 1440;
            }
         System.out.print(time[i] + " ");
      }
      Arrays.sort(time);

      for(int i =1; i<time.length ; i++){
        int mindiff = Math.abs(time[i] - time[i-1]);
        diff = Math.min(diff ,mindiff );
      }

      diff = Math.min(time[0]+ 1440 - time[time.length-1] , diff  );
     
      return diff;
    }
    
}