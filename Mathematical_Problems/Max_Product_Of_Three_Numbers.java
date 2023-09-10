/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
 

Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
Accepted
281.7K
Submissions
620.7K
Acceptance Rate
45.4%

*/

class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int prod=1;
        int x=1;
        prod = nums[n-1]*nums[n-2]*nums[n-3];
        x=nums[0]*nums[1]*nums[n-1];
        prod = Math.max(prod,x);
        return prod;
    }
}
