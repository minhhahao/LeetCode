package com.hazza.LeetCodeByJava.SegmentFour;

/**
 * Created with IntelliJ IDEA.
 * Description: https://leetcode.com/problems/maximum-product-subarray/description/
 *
 * @author Hazzacheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-4-8
 * Time: 9:08 AM
 */
public class No152MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];

        for (int i = 1, iMax = max, iMin = max; i < n; i++) {
            if (nums[i] < 0 && iMax != iMin) {
                iMax ^= iMin;
                iMin ^= iMax;
                iMax ^= iMin;
            }

            iMax = Math.max(nums[i], nums[i] * iMax);
            iMin = Math.min(nums[i], nums[i] * iMin);

            max = Math.max(max, iMax);
        }

        return max;
    }


}
