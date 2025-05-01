import java.util.*;
class Solution {
    public int largestElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}

// TIme Complexity : (nlog n ) && Space Complexity :O(1) this method is neither a brute force not optimal..
// The optimal approch would be a linear search ...

/*
  import java.util.*;
class Solution {
    public int largestElement(List<Integer> nums) {
        Collections.sort(nums);
        return nums.get[nums.size()-1];
    }
}
 */