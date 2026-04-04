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
    int maxi = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       if(root == null)
            return 0;
        max(root);
        return maxi;
    }

    public int max(TreeNode root){
        int l = 0, r= 0;
        if(root.left != null){
            l = max(root.left);
        }
        if(root.right != null){
           r=  max(root.right);
        }

        maxi = Math.max(maxi ,l+r);

        return Math.max(l,r) + 1;
    }
}
