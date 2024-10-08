class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>= 0 && (n & (n-1)) ==0;
    }
}


class Solutions {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Compute log2(n)
        double logResult = Math.log(n) / Math.log(2);
        // Check if the result is an integer by comparing to its nearest integer
        return logResult == (int) logResult;
    }
}



/*          231. Power of Two



            Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1
 
 */