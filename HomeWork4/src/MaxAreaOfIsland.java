import java.util.ArrayDeque;

public class MaxAreaOfIsland {

}

class Solution {

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, helper(grid, i, j));
                }
            }
        }
        return res;
    }

    public int helper(int[][] grid, int i, int j) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{i, j});
        grid[i][j] = 0;
        int count = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int index = 0; index < 4; index++) {
                int mx = x + dx[index];
                int my = y + dy[index];
                if (mx >= 0 && mx < grid.length && my >= 0 && my < grid[0].length && grid[mx][my] == 1) {
                    queue.offer(new int[]{mx, my});
                    grid[mx][my] = 0;
                    count++;
                }
            }
        }
        return count;
    }
}



