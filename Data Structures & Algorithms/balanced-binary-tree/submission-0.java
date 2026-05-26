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
    boolean isbal = true;
    int maxh(TreeNode root){
        if(root==null)return 0;
        int left = maxh(root.left);
        int right = maxh(root.right);
        if(Math.abs(left-right)>1){
            isbal=false;
            return 0;
        }
        return 1+Math.max(left,right); 
    }
    public boolean isBalanced(TreeNode root) {
        maxh(root);
        return isbal;
    }
}
