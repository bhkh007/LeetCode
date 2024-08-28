class Solution{
    public String longestPalindrome(String s){
        if(s==null   || s.length()<=1 )
        return s;

        String res="";
        for(int i=0;i<=s.length()-Math.max(1,res.length());i++){
            for(int j=i+Math.max(1,res.length());j<=s.length();j++){
                String temp = s.substring(i,j);
                if(check(temp))
                res = temp;
            }
        }
    return res;
    }

    public boolean check(String s){
        int low=0, high=s.length()-1;
        while(low < high){
            if(s.charAt(low++) != s.charAt(high --)){
                return false;
            }
        }
        return true;
    }
}


/* 

    

5. Longest Palindromic Substring

Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

 */