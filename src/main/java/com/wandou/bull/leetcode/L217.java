package com.wandou.bull.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liming
 * @date 2022/6/12 21:27
 */
public class L217 {


    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(8);
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.putIfAbsent(n, n) != null) {
                return true;
            }
        }
        return false;
    }
}
