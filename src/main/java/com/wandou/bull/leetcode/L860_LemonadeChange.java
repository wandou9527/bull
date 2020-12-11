package com.wandou.bull.leetcode;

/**
 * @author liming
 * @date 2020/12/10
 * @description 860. 柠檬水找零 简单
 */
public class L860_LemonadeChange {

    public static void main(String[] args) {
        // true
        int[] bills = {5, 5, 5, 10, 20};
        //输入：[5,5,10]
        //输出：true
        int[] bills1 = {5, 5, 10};
        //输入：[10,10]
        //输出：false
        int[] bills2 = {10, 10};
        //输入：[5,5,10,10,20]
        //输出：false
        int[] bill3 = {5, 5, 10, 10, 20};
        // false
        int[] bill4 = {5, 5, 5, 10, 5, 5, 10, 20, 20, 20};

        boolean flag = new L860_LemonadeChange().lemonadeChange(bills);
        System.out.println("flag = " + flag);
        boolean flag1 = new L860_LemonadeChange().lemonadeChange(bills1);
        System.out.println("flag1 = " + flag1);
        boolean flag2 = new L860_LemonadeChange().lemonadeChange(bills2);
        System.out.println("flag2 = " + flag2);
        boolean flag3 = new L860_LemonadeChange().lemonadeChange(bill3);
        System.out.println("flag3 = " + flag3);
        boolean flag4 = new L860_LemonadeChange().lemonadeChange(bill4);
        System.out.println("flag4 = " + flag4);
    }

    public boolean lemonadeChange(int[] bills) {
        int q5 = 0;
        int q10 = 0;
        for (int q : bills) {
            if (q == 5) {
                q5++;
            } else if (q == 10) {
                if (q5 == 0) {
                    return false;
                }
                q5--;
                q10++;
            } else {
                if (q5 > 0 && q10 > 0) {
                    q5--;
                    q10--;
                } else if (q5 >= 3) {
                    q5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
