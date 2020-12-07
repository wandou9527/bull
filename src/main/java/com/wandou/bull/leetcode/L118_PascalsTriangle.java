package com.wandou.bull.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liming
 * @date 2020/12/7
 * @description 118. 杨辉三角 简单
 * https://leetcode-cn.com/problems/pascals-triangle/
 */
public class L118_PascalsTriangle {

    public L118_PascalsTriangle() {
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new L118_PascalsTriangle().generate(5);
        System.out.println("ans = " + ans);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // 获取上一行数据
                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
