import java.util.*;

class SecondLargest {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1;        // Check if the array has less than 2 elements
        Arrays.sort(nums);
        int largest = nums[n - 1];
        int secLargest = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                secLargest = nums[i];
                break;
            }
        }
        return secLargest;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 7, 5};
        // Create an instance of the SecondLargest class
        SecondLargest sol = new SecondLargest();
        /* Call the method to find the second largest element */
        int ans = sol.secondLargestElement(nums);
        System.out.println("The second largest element is: " + ans);
    }
}

/*
import java.util.*;
class Solution {
    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }  
        Arrays.sort(nums);
        // Check for duplicates of the largest element
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[nums.length - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
} */


/*class Solution {
    public int secondLargestElement(List<Integer> nums) {
        if (nums.size() < 2) {
            return -1;
        }
        Collections.sort(nums);
        for (int i = nums.size() - 2; i >= 0; i--) {
            if (!nums.get(i).equals(nums.get(nums.size() - 1))) {
                return nums.get(i);
            }
        }
        
        return -1;
    }
} */