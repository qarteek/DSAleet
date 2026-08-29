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
    public void post(TreeNode root, List<Integer> ne){
        if(root==null) return;

        post(root.left, ne);
        post(root.right, ne);
        ne.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ne = new ArrayList<>();
        post(root, ne);
        return ne;
        
    }
}