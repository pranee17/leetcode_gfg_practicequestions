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
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(TreeNode root)
    {
        if(root==null)
            return new Info(0,0);
        Info leftInfo= diameter(root.left);
        Info rightInfo=diameter(root.right);
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).diam;
    }
 
}