import java.util.*;


class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> d1 = new HashMap<>();
        Map<Character, Character> d2 = new HashMap<>();

        int n = s.length();

        for(int i = 0; i<n ;i++){
            char a = s.charAt(i), b = t.charAt(i);
            if(d1.containsKey(a) && d1.get(a) != b) return false;

            if(d2.containsKey(b) && d2.get(b) != a) return false;

            d1.put(a,b);
            d2.put(b,a);
        }

        return true;
    }
}




/* 
                205. Isomorphic Strings



                Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true

 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 */