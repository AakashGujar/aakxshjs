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
        int[] maxDiameter = new int[1];
        calculateDepth(root,maxDiameter);
        return maxDiameter[0];
    }

    public int calculateDepth(TreeNode currentNode, int[] maxDiameter){
        if(currentNode==null){
            return 0;
        }

        int leftSubTreeDepth = calculateDepth(currentNode.left,maxDiameter);
        int rightSubTreeDepth = calculateDepth(currentNode.right,maxDiameter);

        maxDiameter[0] = Math.max(maxDiameter[0],leftSubTreeDepth+rightSubTreeDepth);

        return 1 + Math.max(leftSubTreeDepth,rightSubTreeDepth);
    }
}