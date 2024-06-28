class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] preMaxheight=new int[n];
        int[] postMaxheight=new int[n];
        preMaxheight[0]=height[0];
        for(int i=1;i<n;i++){
            preMaxheight[i]=Math.max(height[i],preMaxheight[i-1]);
        }
        postMaxheight[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            postMaxheight[i]=Math.max(height[i],postMaxheight[i+1]);
        }
 
        int trapWater=0;
        for(int i=1;i<n-1;i++){
            int maxheight=Math.min(preMaxheight[i-1],postMaxheight[i+1]);
            int water=maxheight-height[i];
            if(water>0){
                trapWater+=water*1;
            }
        }
        return trapWater;
    }
}


/* 

42. Trapping Rain Water
Solved
Hard
Topics
Companies
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105

*/