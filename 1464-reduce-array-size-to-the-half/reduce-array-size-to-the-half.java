class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int len = arr.length ;
        for(int n : arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        int count = 0;
        int ans =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(map.values()); 
        while(count < len/2){
            ans++;
            count += pq.poll();

        }

        return ans ;
    }
}