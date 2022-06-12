package com.wandou.bull.test.demo;

import org.junit.jupiter.api.Test;

public class IntegerDemoTest {

    /**
     * 位运算
     */
    @Test
    public void weiYunSuan() {
        // 位运算移位的方向即为箭头所指方向
        int a = 2 << 1;
        System.out.println(a);

        //Integer.highestOneBit是用来获取最左边的bit（其他bit位为0）所代表的数值.
        System.out.println("Integer.highestOneBit(10) = " + Integer.highestOneBit(10));
        System.out.println("Integer.highestOneBit(1) = " + Integer.highestOneBit(1));
        System.out.println("Integer.highestOneBit(2) = " + Integer.highestOneBit(2));
        System.out.println("Integer.highestOneBit(3) = " + Integer.highestOneBit(3));

        System.out.println(Integer.max(9, 4));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(9 & 5);

        //左移位 2进制的 扩大 移1位即乘以2
        int b = 15 << 1;
        System.out.println("15 << 1: " + b);
        System.out.println("15 >> 1: " + (15 >> 1));

        /*
         *           2^2  2^1  2^0
         * 3的二进制        1     1
         * 左移1位      1   1    0   => 6
         * 右移1位               1   1   => 1
         *
         */
        System.out.println("3 << 1 3左移1位 = " + (3 << 1));
        System.out.println("3 >> 1 3右移1位 = " + (3 >> 1));

        System.out.println("-1 << 19: " + (-1 << 19));
        System.out.println("0 << 19: " + (0 << 19));
        System.out.println("1 << 19: " + (1 << 19));
    }
}
