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
    boolean issame(TreeNode p, TreeNode q){
        if(p==null && q==null)return true;
        if(p==null || q == null)return false;
        return (p.val == q.val) && issame(p.left,q.left) && issame(p.right, q.right);
    }  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null)return true;
        TreeNode curr = null;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.val==subRoot.val){
                curr = temp;
                if(issame(curr, subRoot))return true;
            }
            if(temp.left!=null)q.offer(temp.left);
            if(temp.right!=null)q.offer(temp.right);
        }
        return false;
        
    }
}
