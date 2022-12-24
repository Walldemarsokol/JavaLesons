package HomeWork2;
  
public class Main {
  
}


// 695. Max Area of Island
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                ans = Math.max(ans, dfs(grid, i, j));
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length) {
            return 0;
        }

        if (grid[i][j] != 1) {
            return 0;
        }

        grid[i][j] = 2;

        return 1 + dfs(grid, i + 1, j) + dfs(grid, i - 1, j)
                + dfs(grid, i, j + 1) + dfs(grid, i, j - 1);
    }
}

// 733. Flood Fill
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] seen = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, seen, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int i, int j, boolean[][] seen, int startColor, int newColor) {
        if (i < 0 || i == image.length || j < 0 || j == image[0].length) {
            return;
        }

        if (image[i][j] != startColor || seen[i][j]) {
            return;
        }

        image[i][j] = newColor;
        seen[i][j] = true;

        dfs(image, i + 1, j, seen, startColor, newColor);
        dfs(image, i - 1, j, seen, startColor, newColor);
        dfs(image, i, j + 1, seen, startColor, newColor);
        dfs(image, i, j - 1, seen, startColor, newColor);
    }
}

//   101. Symmetric Tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }

        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
}