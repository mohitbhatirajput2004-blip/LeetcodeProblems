import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
      
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int[] c : classes) {
            double avg = check(c[0], c[1]);
            pq.add(new double[]{avg, c[0], c[1]});
        }

        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            int pass = (int) top[1];
            int total = (int) top[2];
            pass++;
            total++;
            double navg = check(pass, total);
            pq.add(new double[]{navg, pass, total});
        }

        double sum = 0.0;
        for (double[] arr : pq) {
            sum += arr[1] / arr[2];
        }

        return sum / classes.length;
    }

    double check(int pass, int total) {
        double ans = ((double)(pass + 1) / (total + 1)) - ((double) pass / total);
        return ans;
    }
}