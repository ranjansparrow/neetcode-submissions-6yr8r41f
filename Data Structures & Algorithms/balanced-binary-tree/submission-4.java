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
    public boolean result = true;
    public boolean isBalanced(TreeNode root) {
        findDepth(root);
        return result;
    }

    private int findDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = 1 + findDepth(root.left);
        int right = 1 + findDepth(root.right);

        if(Math.abs(left - right) >1) {
            result = false;
        }
        return Math.max(left,right); 
    }
}
