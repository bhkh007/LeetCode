class Solution {
    public String addBinary(String a, String b) {
        var sb = new StringBuilder();

        int i = a.length() - 1 , j = b.length() -1;

        for(int carry = 0 ; i>=0 || j>=0 || carry>0; --i , --j){
            carry += (i>=0 ? a.charAt(i) - '0' :0 ) + (j>=0 ? b.charAt(j) -'0' :0);
            sb.append(carry %2);
            carry /=2;
        }

        return sb.reverse().toString();
    }
}


/* 

                67. Add Binary


Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */