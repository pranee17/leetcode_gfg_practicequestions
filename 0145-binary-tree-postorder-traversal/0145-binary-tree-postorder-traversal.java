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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>result = new ArrayList<>();
        postorder(root,result);
        return result;
    }
    public static void postorder(TreeNode root,ArrayList<Integer> result)
    {  
        if(root==null)
            return;
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);
    }
}