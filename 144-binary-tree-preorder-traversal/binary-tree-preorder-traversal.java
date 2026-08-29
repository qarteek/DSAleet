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
    public void rootasf(List<Integer> ne, TreeNode root){
        if(root==null) return;

        ne.add(root.val);
        rootasf(ne,root.left);
        rootasf(ne,root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ne = new ArrayList<>();
        rootasf(ne, root);
        return ne;
        
    }
}