class Solution {
    public int maxSubArray(int[] arr) {
 
         int ans=Integer.MIN_VALUE;
 
 
ArrayList<Integer> list=new ArrayList<>();
ArrayList<Integer> ansarr=new ArrayList<>();
// Kandane's Alorithm
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            list.add(arr[i]);
             if(sum>=ans){
                ans=sum;
               ansarr.clear();
               ansarr.addAll(list);
             }
 
 
 
            if(sum<0){
                sum=0;
                list.clear();
            }
        }
        System.out.println(ansarr);
        return ans;
 
 
// Brute Force Approach
 
        // for(int i=0;i<arr.length;i++){  
 
        //     for(int j=i;j<arr.length;j++){
 
        //         int sum=0;
        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
        //         }
 
        //         if(sum>ans){
        //             ans=sum;
        //         }
        //     }
        // }
       // return ans;
 
    }
}


// 3rd Approach 

class Solution {
    public int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum=0;

        for(int i = 0;i<arr.length;i++){
            sum +=arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}




/* 

53. Maximum Subarray

Given an integer array nums, find the 
subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104

 */