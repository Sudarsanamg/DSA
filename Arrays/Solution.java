package Arrays;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int missingNumber(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<=n;i++)
        {
            if(!Arrays.asList(nums).contains(i))
            {
                res=i;
            }

        }

        return res;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums1));

        // Example 2
        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums2));
    }
}
