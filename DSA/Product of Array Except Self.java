class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        
        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i]*prefix[i-1];
        }


        int[] postfix = new int[nums.length];
        postfix[nums.length-1] = nums[nums.length-1];
        
        for(int i=nums.length-2;i>=0;i--){
            postfix[i] = nums[i]*postfix[i+1];
        }

        int[] ans = new int[nums.length];

        ans[0] = postfix[1];
        ans[nums.length-1] = prefix[nums.length-2];

        for(int i=1;i<nums.length-1;i++){
            ans[i] = prefix[i-1]*postfix[i+1];
        }    

        return ans;    
    }
}



/* 


238. Product of Array Except Self
Solved
Medium
Topics
Companies
Hint
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)


 */
