/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        if(k == nums.length)
        {
            return nums;
        }

        int result[] = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int item : nums)
        {
            map.put(item, map.getOrDefault(item, 0)+1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(int i: map.keySet())
        {

            queue.offer(i);

        }

        for(int i=0;i < k; i++)
        {
            result[i] = queue.poll();
        }

        return result;
    }
}
