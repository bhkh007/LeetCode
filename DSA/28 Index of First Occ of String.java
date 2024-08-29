class Solution {
    public int strStr(String haystack, String needle) {
        if("".equals(needle)){
            return 0;
        }
        int len1 = haystack.length();
        int len2 = needle.length();
        int p=0;
        int q=0;
        while(p<len1){
            if(haystack.charAt(p) == needle.charAt(q)){
                if(len2==1){
                    return p;
                }
                ++p;
                ++q;
            }
            else{
                p -= q-1;
                q=0;
            }
            if(len2==q){
                return p-q;
            }
        }
        return -1;
    }
}







/* 

28. Find the Index of the First
Occurrence in a String


Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.


 */