import javax.swing.tree.TreeNode;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.empty()) {

            TreeNode leftNode = stack.pop();
            TreeNode rightNode = stack.pop();

            if (leftNode == null && rightNode == null) {
                continue;
            }

            if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
                return false;
            }

            stack.push(leftNode.left);
            stack.push(rightNode.right);
            stack.push(leftNode.right);
            stack.push(rightNode.left);
        }
        return true;
    }
}

