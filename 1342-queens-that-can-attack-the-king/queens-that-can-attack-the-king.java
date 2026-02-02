class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        boolean ans[][] = new boolean[8][8];
        List<List<Integer>> res = new ArrayList<>();

       
        for (int i = 0; i < queens.length; i++) {
            int x = queens[i][0];
            int y = queens[i][1];
            ans[x][y] = true;
        }

        int dx, dy;
        boolean flag;

  
        dx = king[0]; dy = king[1]; flag = false;
        List<Integer> l1 = new ArrayList<>();
        while (dx > 0 && !flag) {
            dx--;
            if (ans[dx][dy]) {
                l1.add(dx); l1.add(dy);
                flag = true;
            }
        }
        if (!l1.isEmpty()) res.add(l1);

      
        dx = king[0]; dy = king[1]; flag = false;
        List<Integer> l2 = new ArrayList<>();
        while (dx > 0 && dy > 0 && !flag) {
            dx--; dy--;
            if (ans[dx][dy]) {
                l2.add(dx); l2.add(dy);
                flag = true;
            }
        }
        if (!l2.isEmpty()) res.add(l2);

       
        dx = king[0]; dy = king[1]; flag = false;
        List<Integer> l3 = new ArrayList<>();
        while (dy > 0 && !flag) {
            dy--;
            if (ans[dx][dy]) {
                l3.add(dx); l3.add(dy);
                flag = true;
            }
        }
        if (!l3.isEmpty()) res.add(l3);

       
        dx = king[0]; dy = king[1]; flag = false;
        List<Integer> l4 = new ArrayList<>();
        while (dx < 7 && dy > 0 && !flag) {
            dx++; dy--;
            if (ans[dx][dy]) {
                l4.add(dx); l4.add(dy);
                flag = true;
            }
        }
        if (!l4.isEmpty()) res.add(l4);

       
        dx = king[0]; dy = king[1]; flag = false;
        List<Integer> l5 = new ArrayList<>();
        while (dx < 7 && !flag) {
            dx++;
            if (ans[dx][dy]) {
                l5.add(dx); l5.add(dy);
                flag = true;
            }
        }
        if (!l5.isEmpty()) res.add(l5);

        
        dx = king[0]; dy = king[1]; flag = false;
        List<Integer> l6 = new ArrayList<>();
        while (dx < 7 && dy < 7 && !flag) {
            dx++; dy++;
            if (ans[dx][dy]) {
                l6.add(dx); l6.add(dy);
                flag = true;
            }
        }
        if (!l6.isEmpty()) res.add(l6);

       
        dx = king[0]; dy = king[1]; flag = false;
        List<Integer> l7 = new ArrayList<>();
        while (dy < 7 && !flag) {
            dy++;
            if (ans[dx][dy]) {
                l7.add(dx); l7.add(dy);
                flag = true;
            }
        }
        if (!l7.isEmpty()) res.add(l7);

        
        dx = king[0]; dy = king[1]; flag = false;
        List<Integer> l8 = new ArrayList<>();
        while (dx > 0 && dy < 7 && !flag) {
            dx--; dy++;
            if (ans[dx][dy]) {
                l8.add(dx); l8.add(dy);
                flag = true;
            }
        }
        if (!l8.isEmpty()) res.add(l8);

        return res;
    }
}