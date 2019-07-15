package com.kebo.leetcode;

/**
 * @description: 至少是其他数字两倍的最大数
 * @Author: kb
 * @Date: 2019-07-15 19:53
 */
public class Solution747 {
    public static int dominantIndex(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[index])
                index= i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != index) {
                if (nums[i] * 2 > nums[index])
                    return -1;
            }
        }
        return index;
    }


}
