
 // Definition for a binary tree node.
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
 
 class Solution {

    private int[] nums;    

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
       return  dfs(0, nums.length -1);
    }

    private TreeNode dfs(int l, int r){
        if(l>r) return null;

        int mid = (l+r) >> 1;
        TreeNode left = dfs(l, mid-1);
        TreeNode right = dfs(mid+ 1, r);

        return new TreeNode(nums[mid], left , right);
    }

    

}


/* 
            108. Convert Sorted Array to Binary Search Tree

            Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced
 binary search tree.

 

Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
 */