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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] valArr = new int[1];
        dfs(root,valArr);
        return valArr[0];
        
    }

    private int dfs(TreeNode root, int[] valArr)
    {
        if(root==null)
        {
            return 0;
        }

        int left = dfs(root.left,valArr);
        int right = dfs(root.right,valArr);
        valArr[0] = Math.max(valArr[0] ,left+right);
        int v = Math.max(left,right);
        return 1+v;

    }

}
