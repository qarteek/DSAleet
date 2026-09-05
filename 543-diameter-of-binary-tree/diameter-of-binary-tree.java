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
    int di = 0;
    public int circle(TreeNode root){
        if(root==null) return 0;
        int l = circle(root.left);
        int r= circle(root.right);
        di = Math.max(di,l  +r);

        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        circle(root);
        return di;
        
    }
}