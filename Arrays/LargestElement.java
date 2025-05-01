import java.util.*;
class LargestElement {
    public static int largElement(int[]  nums) {
        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,2};
        LargestElement sol = new LargestElement();             //Make an intance of the Solution class
        int largest = sol.largElement(nums);
        System.out.print(largest);
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