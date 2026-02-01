import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
      
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int[] c : classes) {
            double avg = ((double)(c[0] + 1) / (c[1] + 1)) - ((double) c[0] / c[1]);
            pq.add(new double[]{avg, c[0], c[1]});
        }

        while (extraStudents > 0) {
            double[] c = pq.poll();
            int p =  (int)c[1];
            int t =  (int)c[2];
            p++;
            t++;
            double navg = ((double)(p + 1) / (t + 1)) - ((double) p / t);
            pq.add(new double[]{navg, p, t});
            extraStudents--;
        }

        double sum = 0.0;
        for (double[] arr : pq) {
            sum += arr[1] / arr[2];
        }

        return sum / classes.length;
    }

   
}