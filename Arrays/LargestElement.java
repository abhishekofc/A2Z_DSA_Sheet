import java.util.*;
class Solution {
    public int largestElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}

// TIme Complexity : (nlog n )
// Space Complexity :O(1)
