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
    public void rem(List<List<Integer>> ne, TreeNode root, int tar, int s, List<Integer> temp){
        if(root==null){
            return;
        }
        temp.add(root.val);
        tar-=root.val;
        if(root.left==null && root.right==null){
            if(tar==0){
                ne.add(new ArrayList(temp));
            }

            temp.remove(temp.size()-1);
            return;
        }
        rem(ne, root.left, tar, s, temp );
       

        rem(ne, root.right, tar,s,temp);

        
        temp.remove(temp.size()-1);


    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ne = new ArrayList<>();
        rem(ne, root, targetSum,0, new ArrayList());
        return ne;
    }
}