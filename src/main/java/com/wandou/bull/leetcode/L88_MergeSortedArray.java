package com.wandou.bull.leetcode;

import java.util.Arrays;

/**
 * @author liming
 * @date 2020/11/23
 * @description 88. 合并两个有序数组
 * <p>
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array/solution/he-bing-liang-ge-you-xu-shu-zu-by-leetcode/
 * 来源：力扣（LeetCode）
 */
public class L88_MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        int[] nums1_1 = {0};
        int m1 = 0;
        int[] nums2_1 = {1};
        int n1 = 1;

//        new L88_MergeSortedArray().merge(nums1, m, nums2, n);
//        System.out.println("nums1 = " + Arrays.toString(nums1));

        new L88_MergeSortedArray().merge(nums1_1, m1, nums2_1, n1);
        System.out.println("nums1_1 = " + Arrays.toString(nums1_1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p--] = nums2[p2--];
            } else {
                nums1[p--] = nums1[p1--];
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public void mergeV2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (true) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p--] = nums2[p2--];
            } else {
                nums1[p--] = nums1[p1--];
            }
        }
    }

}
