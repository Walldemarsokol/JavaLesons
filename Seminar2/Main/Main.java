package Seminar2.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.println(2 == 2);
        String name = "vlad";
        String name2 = scanner.next().trim();
        System.out.println(name == name2);
    }
}

// import Seminar2.Main.*;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println(2 == 2);
//         String name = "Vlad";
//         String name2 = scanner.next().trim();
//         System.out.println(name == name2);
//     }
// }
// package Seminar2.Main;

// public class Main {
//     public static void main(String[] args) {
//         findPath(1, 5, 1, 2, "");
//     } 

//     // static функция может вызывать только другую статик функцию
//     // static - аналог функций верхнего уровня
//     private static void findPath(int src, int target, int addend, int mult, String path) {
//         if (src > target) {
//             return;
//         }
//         if (src == target) {
//             System.out.println(path + "=" + target);
//             return;
//         }

//         findPath(src + addend, target, addend, mult, path + " " + src + "+" + addend);
//         findPath(src * mult, target, addend, mult, path + " " + src + "*" + mult);

//     }
// }

//144. Binary Tree Preorder Traversal
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
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         dfs(root, ans);
//         return ans;

//     }

//     // depth first search (dfs) - обход в глубину
//     private void dfs(TreeNode root, ArrayList<Integer> ans) {
//         if (root == null) {
//             return;
//         }
//         ans.add(root.val);
//         dfs(root.left, ans);
//         dfs(root.right, ans);
//     }

// }


// 104. Maximum Depth of Binary Tree
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int maxDepth(TreeNode root) {
//         if(root==null){
//             return 0;
//         }
//         return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
//     }   
// }

// 100. Same Tree
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
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p==null && q==null){
//             return true;
//         }
//         if (p==null || q==null){
//             return false;
//         }
//         if(p.val !=q.val){
//             return false;
//         }
//         return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//     }
// }

// 200. Number of Islands
// class Solution {
//     public int numIslands(char[][] grid) {
//         int count = 0;
//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[i].length; j++) {
//                 if (grid[i][j] == '1') {
//                     dfs(i, j, grid);
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     private void dfs(int i, int j, char[][] grid) {
//         if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
//                 || grid[i][j] != '1') {
//             return;
//         }

//         grid[i][j] = '0';
//         dfs(i - 1, j, grid);
//         dfs(i + 1, j, grid);
//         dfs(i, j - 1, grid);
//         dfs(i, j + 1, grid);
//     }
// }

