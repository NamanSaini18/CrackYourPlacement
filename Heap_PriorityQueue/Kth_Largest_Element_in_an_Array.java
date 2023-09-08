/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104

*/

class Solution 
{
    public static int findKthLargest(int[] arr,int k)
    {
        return KthLargest(arr,k);
    }
    
    public static int KthLargest(int[] arr,int k)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) 
        {
            queue.add(arr[i]);

        }

        for (int i = k;i < arr.length; i++)
        {
            if(arr[i] > queue.peek())
            {
                queue.poll();
                queue.add(arr[i]);
            }
        }

        return queue.peek();

    }
    // Arrays.sort(nums);
        // return nums[nums.length-k];  O(nlogn) Approach

        //--> Min Heap Approach (Priority Queue)
        // --> O(N logK)
}
