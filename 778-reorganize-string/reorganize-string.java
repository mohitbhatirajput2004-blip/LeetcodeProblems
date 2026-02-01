class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            
            // Optimization: If any char count exceeds (n+1)/2, it's impossible
            if (mp.get(c) > (n + 1) / 2) return "";
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            pq.add(new int[]{e.getValue(), e.getKey()});
        }

        StringBuilder res = new StringBuilder();
        while (pq.size() > 1) {
            // Pull the two most frequent characters to ensure they are separated
            int[] first = pq.poll();
            int[] second = pq.poll();

            res.append((char) first[1]);
            res.append((char) second[1]);

            if (--first[0] > 0) pq.add(first);
            if (--second[0] > 0) pq.add(second);
        }

        // If there's one character left, add it to the end
        if (!pq.isEmpty()) {
            res.append((char) pq.poll()[1]);
        }

        return res.toString();
    }
}