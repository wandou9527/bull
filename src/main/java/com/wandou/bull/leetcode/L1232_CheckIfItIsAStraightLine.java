package com.wandou.bull.leetcode;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author liming
 * @date 2021/1/17
 * @description
 */
public class L1232_CheckIfItIsAStraightLine {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        //输入：coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
        //输出：false
        int[][] coordinates1 = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

        boolean flag = solution.checkStraightLine(coordinates);
        System.out.println("flag = " + flag);
        boolean flag1 = solution.checkStraightLine(coordinates1);
        System.out.println("flag1 = " + flag1);

    }

    static class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            if (coordinates.length <= 2) {
                return true;
            }
            // 角度比例
            BigDecimal angleRatio = new BigDecimal(coordinates[1][1] - coordinates[0][1])
                    .divide(new BigDecimal(coordinates[1][0] - coordinates[0][0]), 2, RoundingMode.HALF_EVEN);
            for (int i = 2; i < coordinates.length; i++) {
                BigDecimal angleRatioTemp = new BigDecimal(coordinates[i][1] - coordinates[i - 1][1])
                        .divide(new BigDecimal(coordinates[i][0] - coordinates[i - 1][0]), 2, RoundingMode.HALF_EVEN);
                if (!angleRatio.equals(angleRatioTemp)) {
                    return false;
                }
            }
            return true;
        }
    }
}
