package com.wandou.bull.leetcode;

/**
 * @author liming
 * @date 2021/1/23
 * @description
 */
public class L9_HuiWenShu {

    public static void main(String[] args) {
        int x = 121;
        int x1 = 12;
        int x2 = 10;
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(x);
        System.out.println("palindrome = " + palindrome);
        boolean palindrome1 = solution.isPalindrome(x1);
        System.out.println("palindrome1 = " + palindrome1);
        boolean palindrome2 = solution.isPalindrome(x2);
        System.out.println("palindrome2 = " + palindrome2);
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int reverseNum = 0;
            while (x > reverseNum) {
                reverseNum = reverseNum * 10 + x % 10;
                x = x / 10;
            }
            return x == reverseNum || x == reverseNum / 10;
        }
    }
}
