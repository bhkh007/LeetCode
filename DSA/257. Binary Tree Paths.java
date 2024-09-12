import java.util.*;


 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(){}
    TreeNode(int val){
    this.val = val;
    }
        TreeNode(int val, TreeNode left,TreeNode right){
            this.val= val;
            this.left = left;
            this.right = right;
        }
        
    }
    
    class Solution{
    
        private List<String> ans = new ArrayList<>();
        private List<String> t = new ArrayList<>();
    
        public List<String> binaryTreePaths(TreeNode root){
                dfs(root);
                return ans;
        }
    
        public void dfs(TreeNode root){
            if(root == null){
                return;
            }
    
            t.add(root.val + "");
    
            if(root.left == null && root.right == null){
                ans.add(String.join("->", t));
            }
            else{
                dfs(root.left);
                dfs(root.right);
            }
    
            t.remove(t.size() - 1);
        }
    }
/* 
                257. Binary Tree Paths




                Given the root of a binary tree, return all root-to-leaf paths in any order.

                A leaf is a node with no children.

 

Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]
 

Constraints:

The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100
 */