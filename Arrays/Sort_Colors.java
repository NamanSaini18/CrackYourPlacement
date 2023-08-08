/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 

Follow up: Could you come up with a one-pass algorithm using only constant extra space?

*/


class Solution {
    public void sortColors(int[] nums) 
    {
        // Using Dutch National Flag Algorithm
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int temp;
        while(mid <= high)
        {
            switch(nums[mid]) 
            {
                case 0: 
                {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: 
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    // mid++;
                    break;
                }
            }
        }




        
        // int zero = 0,one = 0,two = 0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i] == 0)
        //     {
        //         zero++;
        //     }
        //     else if(nums[i] == 1)
        //     {
        //         one++;
        //     }
        //     else
        //     {
        //     {
        //         nums[j] = 1;

        //     }
        //     else
        //     {
        //         nums[j] = 2;
        //     }
        // }    two++;
        //     }
        // }
        // for(int j=0;j<nums.length;j++)
        // {
        //     if(zero-- > 0)
        //     {
        //         nums[j] = 0;
        //     }
        //     else if(one-- > 0)
        //     
    }
}
