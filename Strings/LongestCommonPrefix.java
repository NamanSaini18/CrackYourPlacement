// Problem Link : https://leetcode.com/problems/longest-common-prefix/description/

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/


class Solution {
    public String longestCommonPrefix(String[] string) 
    {
        if(string.length == 0)
        {
            return "";
        }

        String ans = string[0];

        for(int i=1;i<string.length;i++)
        {
            while(string[i].indexOf(ans) != 0)
            {
                ans = ans.substring(0,ans.length()-1);
            }
        }
        
        return ans;
    }
}
