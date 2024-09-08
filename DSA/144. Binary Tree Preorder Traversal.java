import java.util.*;

class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    } 
    TreeNode(int val, TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

class Solution {

    private List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        
        dfs(root);
        return ans;

    }
    public void dfs(TreeNode root){
        if(root == null) return;

        ans.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

}


/* 
            144. Binary Tree Preorder Traversal

            Given the root of a binary tree, return the preorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]

Output: [1,2,3]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [1,2,4,5,6,7,3,8,9]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]

 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */