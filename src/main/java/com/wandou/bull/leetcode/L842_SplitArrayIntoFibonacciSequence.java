package com.wandou.bull.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liming
 * @date 2020/12/11
 * @description 842. 将数组拆分成斐波那契序列 中等
 */
public class L842_SplitArrayIntoFibonacciSequence {

    public static void main(String[] args) {
        String S = "123456579";
        List<Integer> list = new L842_SplitArrayIntoFibonacciSequence().splitIntoFibonacci(S);
        System.out.println("list = " + list);
    }

//    public List<Integer> splitIntoFibonacci(String S) {
//        List<Integer> target = new ArrayList<>();
//        for (int i = 0; i < S.length(); i++) {
//            String start = S.substring(0, i + 1);
//
//        }
//        return target;
//    }

    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> list = new ArrayList<>();
        backtrack(list, S, S.length(), 0, 0, 0);
        return list;
    }

    public boolean backtrack(List<Integer> list, String S, int length, int index, int sum, int prev) {
        if (index == length) {
            return list.size() >= 3;
        }
        long currLong = 0;
        for (int i = index; i < length; i++) {
            if (i > index && S.charAt(index) == '0') {
                break;
            }
            currLong = currLong * 10 + S.charAt(i) - '0';
            if (currLong > Integer.MAX_VALUE) {
                break;
            }
            int curr = (int) currLong;
            if (list.size() >= 2) {
                if (curr < sum) {
                    continue;
                } else if (curr > sum) {
                    break;
                }
            }
            list.add(curr);
            if (backtrack(list, S, length, i + 1, prev + curr, curr)) {
                return true;
            } else {
                list.remove(list.size() - 1);
            }
        }
        return false;
    }
}
