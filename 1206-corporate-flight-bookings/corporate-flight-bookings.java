class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n+1];  

        
        for (int[] booking : bookings) {
            int start = booking[0];
            int end = booking[1];
            int val = booking[2];

            ans[start - 1] += val;   
            ans[end] -= val;        
        }

        
        int[] res = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ans[i];
            res[i] = sum;
        }

        return res;
    }
}