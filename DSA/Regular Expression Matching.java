class Solution {
   
   
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // Empty string matches empty pattern
        
        // Handle patterns like "a*", "b*", "c*", etc.
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        // Fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char currentS = s.charAt(i - 1);
                char currentP = p.charAt(j - 1);
                
                if (currentS == currentP || currentP == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (currentP == '*') {
                    char prevP = p.charAt(j - 2);
                    if (prevP == currentS || prevP == '.') {
                        dp[i][j] = dp[i][j - 2] || dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }
        
        return dp[m][n];
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "aa";
        String p1 = "a";
        System.out.println(solution.isMatch(s1, p1)); // Output: false

        String s2 = "aa";
        String p2 = "a*";
        System.out.println(solution.isMatch(s2, p2)); // Output: true

        String s3 = "ab";
        String p3 = ".*";
        System.out.println(solution.isMatch(s3, p3)); // Output: true
    }
    }



/* 


10. Regular Expression Matching
Solved
Hard
Topics
Companies
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
 

Constraints:

1 <= s.length <= 20
1 <= p.length <= 20
s contains only lowercase English letters.
p contains only lowercase English letters, '.', and '*'.
It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.


 */