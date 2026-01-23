class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n+1];
        int pre[] = new int [n];
        for(int  i= 0 ; i< bookings.length ; i++){
            int start = bookings[i][0];
            int end = bookings[i][1];
            int val = bookings[i][2];

            ans[start-1] += val;
            ans[end]  -= val;  


        }
        int sum=0;
        for(int i = 0 ; i< n ; i++){
             sum += ans[i];

             pre[i] = sum;

        }
        return pre;
    }
}
