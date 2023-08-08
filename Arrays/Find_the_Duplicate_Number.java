/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

Follow up:

How can we prove that at least one duplicate number must exist in nums?
Can you solve the problem in linear runtime complexity?


*/


class Solution {
    public int findDuplicate(int[] arr) 
    {
        // HashSet<Integer> set = new HashSet<>();

        // for(int num : arr)
        // {
        //     if(!set.add(num))
        //     {
        //         return num;
        //     }
        // }
        // return 0;
        
        // Brute Force
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[i] == arr[j])
        //         {
        //             return arr[i];
        //         }
        //     }
        // }
        // return 0;

        int low = 0,high = arr.length-1;
        int ctr;
        
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            ctr = 0;
            for(int num : arr)
            {
                if(num <= mid)
                {
                    ctr++;
                }


            }
            if(ctr <= mid)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
            
        }

        return low;

        
    }
}
