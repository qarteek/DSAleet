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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> ne = new LinkedList<>();
        List<List<Integer>> nee = new ArrayList<>();

        if(root==null) return nee;
        ne.offer(root);
        
        
        while(!ne.isEmpty()){
            int num = ne.size();
            List<Integer> me = new ArrayList<>();

            for(int i = 0 ; i < num ; i++){
                if(ne.peek().left!=null) ne.offer(ne.peek().left);
                if(ne.peek().right!=null) ne.offer(ne.peek().right);
                me.add(ne.poll().val);
            }
            nee.add(me);
        }
        return nee;
        
    }
}